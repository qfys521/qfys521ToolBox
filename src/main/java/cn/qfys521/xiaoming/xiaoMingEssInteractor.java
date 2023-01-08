package cn.qfys521.xiaoming;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class xiaoMingEssInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {

    @Filter("say {rn:say}")
    @Required("core.say")
    public void say(XiaoMingUser user,
                    @FilterParameter("say") String say) {
        user.sendMessage(say);
    }

    @Filter("pl")
    @Required("core.plugins")
    public void pl(XiaoMingUser user) {
        Map<String, Plugin> plugins = xiaoMingBot.getPluginManager().getPlugins();
        Set<String> set = plugins.keySet();
        Iterator<String> i = set.iterator();
        StringBuilder sb = new StringBuilder();
        while (i.hasNext()) {
            sb.append("\n");
            sb.append(i.next());
        }
        user.sendMessage("======Plugins======" + sb);
    }

    @Filter("(time|时间)")
    public void ntimes(XiaoMingUser user) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        user.sendMessage("now is: " + sdf.format(date));
    }

    @Filter("快速关闭小明")
    @Required("qfys521ToolBox.admin.quickstop")
    public void stop(XiaoMingUser user) {
        xiaoMingBot.getFileSaver().save();
        user.sendMessage("xiaoMingBot.getFileSaver().save()");
        System.exit(0);
    }

}
