package cn.codethink.qfys521.phigros;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.codethink.qfys521.qfys521UtilPlugin;

public class phigrosInteractors extends SimpleInteractors<qfys521UtilPlugin> {
    final String perm = "qfys521Util";

    @Required(perm + ".phigros")
    @Filter("单曲rks计算 {ACC} {定数}")
    public void RKSACCSONG(XiaoMingUser user,
                           @FilterParameter("ACC") double ACC,
                           @FilterParameter("定数") double 定数) {
        if (ACC > 100) {
            user.sendError("\n" + "ACCMoreThan'100'Exception");
        } else if (ACC < 0) {
            user.sendError("\n" + "AccLessThan'0'Exception");
        } else if (定数 > 16.08) {
            user.sendError("\n" + "定数MoreThan'16.08'Exception");
        } else if (定数 < 0) {
            user.sendError("\n" + "定数LessThan'0'Exception");
        }

        double a = ((ACC - 55) / 45);
        double rksSong = a * a * 定数;

        user.sendMessage("该单曲的rks为:" + rksSong);
    }

}

