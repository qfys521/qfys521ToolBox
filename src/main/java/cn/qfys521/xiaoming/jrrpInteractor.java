package cn.qfys521.xiaoming;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521ToolBoxPlugin;

public class jrrpInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {


    private static final String KEY = "Zm5kZm5kZm5mZ25mZGduYmZrLmhnZmdmZmYvZmg3Cl0vOTg3NjU=";

    @Filter("jrrp|今日人品")
    public static void main(XiaoMingUser user) {
        int code = LuckAlgorithm.get(user.getCode(), KEY);
        if (code == 100) {
            user.sendMessage("您的人品值为:100!100!100!");
        } else {
            user.sendMessage("您的人品值为:" + code);
        }

    }
}
