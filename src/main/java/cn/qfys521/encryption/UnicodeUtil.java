package cn.qfys521.encryption;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521UtilPlugin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnicodeUtil extends SimpleInteractors<qfys521UtilPlugin> {


    @Filter("UnicodeEncode {r:sourceData}")
    @Required("qfys521Util.encryption.Unicode.Encode")
    public static void Encode(
            XiaoMingUser BotSender,
            @FilterParameter("sourceData") String sourceData
    ) {
        String unicodeEncode = unicodeEncode(sourceData);
        String unicodeEncode2 = unicodeEncode.replaceAll("u", "\\u");
        BotSender.sendMessage("Encode:" + unicodeEncode2);
    }

    @Filter("UnicodeDecode {r:unicodeEncode}")
    @Required("qfys521Util.encryption.Unicode.Decode")
    public static void Decode(
            XiaoMingUser BotSender,
            @FilterParameter("unicodeEncode") String unicodeEncode
    ) {
        String unicodeDecode = unicodeDecode(unicodeEncode);
        BotSender.sendMessage("Decode:" + unicodeDecode);
    }


    /**
     * @param string
     * @return
     * @Title: unicodeEncode
     * @Description: unicode编码
     */
    public static String unicodeEncode(String string) {
        char[] utfBytes = string.toCharArray();
        String unicodeBytes = "";
        for (int i = 0; i < utfBytes.length; i++) {
            String hexB = Integer.toHexString(utfBytes[i]);
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        return unicodeBytes;
    }

    /**
     * @param string
     * @return
     * @Title: unicodeDecode
     * @Description: unicode解码
     */
    public static String unicodeDecode(String string) {
        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(string);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            string = string.replace(matcher.group(1), ch + "");
        }
        return string;
    }
}
