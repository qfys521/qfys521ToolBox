package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Utils.jrrpUtil.LuckAlgorithm;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.util.Objects;

public class jrrpInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {


    private static final String KEY = "L.THERE ARE NO KEYS HERE";

    @Filter("jrrp|今日人品")
    public static void main(XiaoMingUser user) {
        int code = LuckAlgorithm.get(user.getCode(), KEY);
        if (code == 100) {
            user.sendMessage("您的人品值为:100!100!100!");
        } else if (code == 0) {
            user.sendMessage("请悉知:本插件绝对不会有任何对于任何用户有负面性的针对的影响。");
            user.sendMessage("本插件jrrp算法采用加密算法，且没有任何的set()方法。");
            user.sendMessage("在使用本插件时，请确保您有足够的心态，倘若因为该结果的原因导致您做出包括但不限于以下行为时:");
            user.sendMessage("如：砸坏您的电子设备、对于其他人造成不可逆的影响等一切行为时，");
            user.sendMessage("本插件一律不付任何的责任。");
            user.sendMessage("您仍然要继续吗（发送\"退出\"退出，或者发送其他消息继续）？");
            String tmpMessage = user.nextMessageOrExit().serialize();
            if (!Objects.equals(tmpMessage, "退出")) {
                user.sendError("很抱歉，您的今日人品值为0。");
                user.sendMessage("本插件开发者绝对不会做出任何的干预行为。");
            }
        } else {
            user.sendMessage("您的今日人品为: " + code);
        }

    }
}
