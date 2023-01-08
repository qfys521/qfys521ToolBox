package cn.qfys521.encryption;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @description:
 * @author: lv
 * @time: 2020/9/3 9:18
 */
public class MD5Util extends SimpleInteractors<qfys521ToolBoxPlugin> {
    @Filter("MD5 {r:str}")
    @Required("qfys521ToolBox.encryption.MD5")
    public static void main(
            XiaoMingUser BotSender,
            @FilterParameter("str") String str) {
        byte[] digest = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            digest = md5.digest(str.getBytes("utf-8"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            BotSender.sendError("Error:" + e);
        }
        //16是表示转换为16进制数
        String md5Str = new BigInteger(1, digest).toString(16);
        BotSender.sendMessage("MD5:\n" + md5Str);
    }

}