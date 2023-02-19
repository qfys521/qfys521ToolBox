package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Utils.encryption.UnicodeUtil;
import cn.qfys521.qfys521ToolBoxPlugin;

/**
 * @author qfys521
 */
@SuppressWarnings("all")
public class UnicodeInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {
    UnicodeUtil unicodeUtil = new UnicodeUtil();

    /**
     * @param BotSender  BotSender
     * @param sourceData sourceData
     */
    @Filter("UnicodeEncode {r:sourceData}")
    @Required("qfys521ToolBox.encryption.Unicode.Encode")
    public void Encode(XiaoMingUser BotSender,
                       @FilterParameter("sourceData") String sourceData
    ) {
        String unicodeEncode =
                unicodeUtil
                        .unicodeEncode(sourceData)
                        .replaceAll("u", "\\\\u");
        ;
        BotSender.sendMessage("Encode:" + unicodeEncode);
    }

    /**
     * @param user          XiaoMingUser
     * @param unicodeEncode unicodeEncode
     */
    @Filter("UnicodeDecode {r:unicodeEncode}")
    @Required("qfys521ToolBox.encryption.Unicode.Decode")
    public void Decode(XiaoMingUser user,
                       @FilterParameter("unicodeEncode") String unicodeEncode
    ) {
        String unicodeDecode = unicodeUtil
                .unicodeDecode(unicodeEncode);
        user.sendMessage("Decode:" + unicodeDecode);
    }

}
