package cn.codethink.qfys521.GhenshenImpact;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.codethink.qfys521.qfys521UtilPlugin;


public class genshenImpactInteractor extends SimpleInteractors<qfys521UtilPlugin> {
    final String perm = "qfys521Util";

    /**
     * 首先使用 {@link cn.chuanwise.xiaoming.annotation.FilterParameter} 获取参数，即:"当前树脂数量(from:{@link cn.codethink.qfys521.GhenshenImpact.genshenImpactInteractor})"
     * 随后，进行判断树脂数量
     */
    @Filter("树脂计算工具 {当前树脂数量}")
    @Required(perm)
    void 树脂计算工具(XiaoMingUser user,
                @FilterParameter("当前树脂数量") int 当前树脂数量) {
        if (当前树脂数量 < 0) {
            user.sendError("抱歉，树脂数量不能小于0!");
            return;
        } else if (当前树脂数量 > 160) {
            user.sendError("抱歉，树脂数量不能大于160!");
            return;
        } else {
            int 总数量 = 160;
            int 差值 = 总数量 - 当前树脂数量;
            int 恢复所需时间 = 差值 * 8 * 60;
            int 时, 分, 秒;
            秒 = (恢复所需时间 % 60) % 60;
            分 = (恢复所需时间 % 3600) / 60;
            时 = 恢复所需时间 / 3600;
            user.sendMessage("您的树脂将于" + 时 + "时" + 分 + "分" + 秒 + "秒" + "后恢复满."+"\n以为您创建提醒。");
            new Thread(() -> {
                try {
                    Thread.sleep(恢复所需时间 * 1000);
                } catch (InterruptedException e) {
                    user.sendError("Error:" + "\n" + e);
                }
                user.sendMessage("您的树脂已经恢复完毕");
            }).start();
        }
    }
}







