package cn.codethink.qfys521.xiaoming;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.GroupXiaoMingUser;

import cn.codethink.qfys521.qfys521UtilPlugin;

public class TimedTask extends SimpleInteractors<qfys521UtilPlugin> {
    int 次数;
    @Filter("定时消息 {r:内容} {r:间隔时间h} {r:循环次数}")
    @Required("qfys521Util.xiaoming.TimedTask.autoSendMessage")
    public void TimesTask(GroupXiaoMingUser groupXiaoMingUser,
                          @FilterParameter("内容")String 内容,
                          @FilterParameter("循环次数")int 次数,
                          @FilterParameter("间隔时间h")Long 间隔时间){
        this.次数 = 次数;
        long groupCode = groupXiaoMingUser.getGroupCode();
        long commandSenderQQCode = groupXiaoMingUser.getCode();
        new Thread(() -> {
            try {
                Thread.sleep(间隔时间 * 3600000);
            } catch (Exception e) {
                groupXiaoMingUser.sendGroupMessage("Error:"+e);
            }try {
                for (int a = 0; a < 次数; a++) {
                    groupXiaoMingUser.sendGroupMessage(内容);
                }
            }catch (Exception ie){
                groupXiaoMingUser.sendError("Error:"+ie);
            }
        }


        );
    }
}
