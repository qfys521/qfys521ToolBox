package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521ToolBoxPlugin;

/**
 * @author qfys521
 */
public class genshinImpactInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {
    final String perm = "qfys521ToolBox";

    /**
     * 首先使用 {@link cn.chuanwise.xiaoming.annotation.FilterParameter} 获取参数，即:"nowCount{@link genshinImpactInteractor}"
     * 随后，进行判断树脂数量
     *
     * @param user     XiaoMingUser
     * @param nowCount nowCount
     */
    @Filter("树脂计算工具 {nowCount}")
    @Required(perm)
    public void 树脂计算工具(XiaoMingUser user,
                             @FilterParameter("nowCount") int nowCount) {
        if (nowCount < 0) {
            user.sendError("抱歉，树脂数量不能小于0!");
        } else if (nowCount > 160) {
            user.sendError("抱歉，树脂数量不能大于160!");
        } else {
            int allCount = 160;
            int tmp = allCount - nowCount;
            int needTime = tmp * 8 * 60;
            int h, m, s;
            s = (needTime % 60) % 60;
            m = (needTime % 3600) / 60;
            h = needTime / 3600;
            user.sendMessage("您的树脂将于" + h + "时" + m + "分" + s + "秒" + "后恢复满." + "\n以为您创建提醒。");
            new Thread(() -> {
                try {
                    Thread.sleep(needTime * 1000);
                } catch (InterruptedException e) {
                    user.sendError("Error:" + "\n" + e);
                }
                user.sendMessage("您的树脂已经恢复完毕");
            }).start();
        }
    }
}







