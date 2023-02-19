package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.plugin.PluginHandler;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author qfys521
 */
@SuppressWarnings("all")
public class pluginsInteractors extends SimpleInteractors<qfys521ToolBoxPlugin> {
    /**
     * 获取插件列表
     *
     * @param user XiaoMingUser
     */
    @Filter("pl|plugins|插件|插件列表")
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

    /**
     * 获取插件信息
     *
     * @param user   XiaoMingUser
     * @param plugin plugin
     * @param Name   Name
     */
    @Filter("(plugins|pl) info {r:PluginName}")
    @Required("core.info")
    public void PluginInfo(XiaoMingUser user, @FilterParameter("PluginName") PluginHandler plugin, @FilterParameter("PluginName") Plugin Name) {
        String var10001 = plugin.getName();
        if (plugin.getSingleAuthor() != null) {
            user.sendMessage("名称:" +
                    var10001 + "\n版本:" +
                    Name.getVersion() +
                    "\n作者:" + plugin.getSingleAuthor()
                    + "\n插件主类:" + plugin.getMainClassName()
                    + "\n启动状态:" + Name.getStatus() +
                    "\n命令数量:" + this.xiaoMingBot.getInteractorManager().getInteractors(Name).size()
                    + "\n监听器数量" + this.xiaoMingBot.getEventManager().getListeners(Name).size());
        } else {
            user.sendMessage("名称:" +
                    var10001 + "\n版本:" +
                    Name.getVersion() +
                    "\n作者:" + Arrays.toString(plugin.getMultipleAuthors())
                    + "\n插件主类:" + plugin.getMainClassName()
                    + "\n启动状态:" + Name.getStatus() +
                    "\n命令数量:" + this.xiaoMingBot.getInteractorManager().getInteractors(Name).size()
                    + "\n监听器数量" + this.xiaoMingBot.getEventManager().getListeners(Name).size());
        }
    }

    /**
     * 重载插件
     *
     * @param user XiaoMingUser
     * @param Name Name
     */
    @Filter("(plugins|pl) reload {r:PluginName}")
    @Required("plugman.reload")
    public void reload(XiaoMingUser user, @FilterParameter("PluginName") Plugin Name) {
        try {
            this.xiaoMingBot.getFileSaver().save();
            this.xiaoMingBot.getPluginManager().reloadPlugin(Name);
            this.xiaoMingBot.getPluginManager().reenablePlugin(Name);
        } catch (Exception var4) {
            user.sendError("重启时发生错误,异常为:" + var4);
        }
        user.sendMessage("插件重启成功.");
    }

}
