package cn.qfys521.group;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.chuanwise.xiaoming.util.MiraiCodes;
import cn.qfys521.qfys521UtilPlugin;
import net.mamoe.mirai.message.data.ForwardMessage;
import net.mamoe.mirai.message.data.MessageChain;
import net.mamoe.mirai.message.data.PlainText;
import net.mamoe.mirai.message.data.RawForwardMessage;

import java.util.ArrayList;
import java.util.List;

public class dummyMessage extends SimpleInteractors<qfys521UtilPlugin> {
    @Filter("MessageBuilder {rn:qq} {rn:nick} {rn:Message}")
    public void main(XiaoMingUser user,
                     @FilterParameter("qq") Long qq,
                     @FilterParameter("nick") String nick,
                     @FilterParameter("Message") String Message
    ) {
        List<ForwardMessage.Node> nodes = new ArrayList<>();
        MessageChain chain = new PlainText(String.valueOf(Message)).plus(" ");
        ForwardMessage.Node node = new ForwardMessage.Node(qq, (int) System.currentTimeMillis(), nick, MiraiCodes.asMessageChain(Message));
        nodes.add(node);
        ForwardMessage forwardMessage = new RawForwardMessage(nodes).render(ForwardMessage.DisplayStrategy.Default);
        user.sendMessage(forwardMessage);
    }

}
