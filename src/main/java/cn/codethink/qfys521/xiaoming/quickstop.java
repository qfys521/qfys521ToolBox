package cn.codethink.qfys521.xiaoming;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.codethink.qfys521.qfys521UtilPlugin;



public class quickstop extends SimpleInteractors<qfys521UtilPlugin> {
    @Filter("快速关闭小明")
    @Required("qfys521Util.admin.quickstop")
    public void main(XiaoMingUser user){
    xiaoMingBot.getFileSaver().save();
    user.sendMessage("xiaoMingBot.getFileSaver().save()");
    System.exit(0);
    }
}
