package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Utils.encryption.MD5Util;
import cn.qfys521.qfys521ToolBoxPlugin;

/**
 * @author qfys521
 */
public class MD5Interactor extends SimpleInteractors<qfys521ToolBoxPlugin> {
    /**
     * @param user  XiaoMingUser
     * @param str str
     */
    @Filter("MD5 {r:str}")
    @Required("qfys521ToolBox.encryption.MD5")
    public void main(XiaoMingUser user, @FilterParameter("str") String str) {
        MD5Util md5Util = new MD5Util();
        user.sendMessage(md5Util.toMD5(str));
    }

}