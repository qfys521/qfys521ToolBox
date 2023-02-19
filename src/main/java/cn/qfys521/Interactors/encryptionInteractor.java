package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Utils.encryption.Base64Util;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author qfys521
 */

public class encryptionInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {

    static final String perm = "qfys521ToolBox.";

    /**
     * 生成 uuid
     *
     * @param user user
     */
    @Filter("UUID生成")
    @Required(perm + "encryption.UUID")
    public void UUID(XiaoMingUser user) {
        String uuid = null;
        for (int i = 0; i < 10; i++) {
            uuid = UUID.randomUUID().toString();
        }
        user.sendMessage(uuid);
    }

    /**
     * for循环生成uuid
     *
     * @param user XiaoMingUser
     * @param 数量
     */

    @Filter("批量UUID生成 {数量}")
    @Required(perm + "encryption.UUID.batch")
    void UUIDBatch(XiaoMingUser user,
                   @FilterParameter("数量") int 数量) {
        int i = 数量;
        if (i <= 0) {
            user.sendError("数量不能小于零!");
        } else if (i > 50) {
            user.sendError("数量过多!");
        } else {
            try {
                String uuid = null;
                String[] lista = new String[i];
                for (int a = 0; a < i; a++) {
                    uuid = UUID.randomUUID().toString();
                    lista[a] = uuid;
                }
                user.sendMessage(Arrays.toString(lista));
            } catch (Exception e) {
                user.sendMessage("Error:" + "\n" + e);
            }
        }

    }

    /**
     * @param user user
     * @param text test
     */
    @Filter("Base64Encode {文本内容}")
    @Filter("base64-encode {文本内容}")
    @Required(perm + "base64.lock")
    public void base64lock(XiaoMingUser user,
                           @FilterParameter("文本内容") String text) {
        try {
            user.sendMessage("转换后:" + Base64Util.encode(text));
        } catch (Exception e) {
            user.sendError("您不能这么做。" + "\n" + e);
        }

    }

    @Filter("Base64Decode {文本内容}")
    @Filter("base64-decode {文本内容}")
    @Required(perm + "base64.unlock")
    void base64unlock(XiaoMingUser user,
                      @FilterParameter("文本内容") String text) {
        try {
            user.sendMessage("转换后:" + Base64Util.decode(text));
        } catch (Exception e) {
            user.sendMessage("Error:" + e);
        }

    }

}

