package cn.qfys521.Utils.ForwardMessageUtil;

import cn.chuanwise.xiaoming.util.MiraiCodes;
import net.mamoe.mirai.message.code.MiraiCode;
import net.mamoe.mirai.message.data.ForwardMessage;
import net.mamoe.mirai.message.data.MessageChain;
import net.mamoe.mirai.message.data.RawForwardMessage;
import net.mamoe.mirai.message.data.SingleMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qfys521
 */
@SuppressWarnings("all")
public class ForwardMessageBuilder {

    List<ForwardMessage.Node> nodeList = new ArrayList<>(100);

    /**
     * @param senderCode senderCode
     * @param time time
     * @param senderName senderName
     * @param message message
     * @return this
     */
    public ForwardMessageBuilder add(long senderCode, int time, String senderName, String message) {
        add(senderCode, time, senderName, MiraiCode.deserializeMiraiCode(message));
        return this;
    }

    /**
     * @param senderCode senderCode
     * @param time time
     * @param senderName senderName
     * @param message message
     * @return this
     */
    public ForwardMessageBuilder add(long senderCode, int time, String senderName, MessageChain message) {
        ForwardMessage.Node node = new ForwardMessage.Node(senderCode, time, senderName, message);
        nodeList.add(node);
        return this;
    }

    /**
     * @param senderCode senderCode
     * @param time time
     * @param senderName senderName
     * @param messages messages
     * @return this
     */
    public ForwardMessageBuilder add(long senderCode, int time, String senderName, SingleMessage... messages) {
        add(senderCode, time, senderName, MiraiCodes.asMessageChain(messages));
        return this;
    }

    /**
     * @return build(ForwardMessage.DisplayStrategy.Default)
     */
    public ForwardMessage build() {
        return build(ForwardMessage.DisplayStrategy.Default);
    }

    /**
     * @param displayStrategy displayStrategy
     * @return new RawForwardMessage(nodeList).render(displayStrategy)
     */
    public ForwardMessage build(ForwardMessage.DisplayStrategy displayStrategy) {
        return new RawForwardMessage(nodeList).render(displayStrategy);
    }

}
