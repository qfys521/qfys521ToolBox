package cn.qfys521;


import cn.chuanwise.xiaoming.interactor.Interactors;
import cn.chuanwise.xiaoming.interactor.customizer.InteractorCustomizer;
import cn.chuanwise.xiaoming.object.PluginObject;
import cn.chuanwise.xiaoming.plugin.JavaPlugin;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.qfys521.Interactors.*;
import cn.qfys521.Utils.DataUtil.yamlUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 插件主类
 * 类的全限定名要和资源文件 xiaoming.json 或 plugin.json 中的 main 完全相同
 *
 * @author Chuanwise
 * @version 1.0-SNAPSHOT
 */
public class qfys521ToolBoxPlugin extends JavaPlugin {

    /**
     * 插件具备 static final 的名为 INSTANCE 的属性时，小明会首先查看其值是否
     * 实现了 {@link cn.chuanwise.xiaoming.plugin.Plugin} 接口，如果实现
     * 则取出并作为本插件加载。如果不是，或为 null，则小明将调用默认的无参构造方法
     * 构造一个插件主类的对象。
     */
    private static final qfys521ToolBoxPlugin INSTANCE = new qfys521ToolBoxPlugin();


    /**
     * 获取插件实例
     *
     * @return INSTANCE
     */
    public static qfys521ToolBoxPlugin getINSTANCE() {
        return INSTANCE;
    }

    /**
     * 插件启动时的回调方法
     */
    @Override
    @SuppressWarnings("all")
    public void onEnable() {
        this.regInteractors(this,
                new ReflectionInteractor(),
                new pluginsInteractors(),
                new genshinImpactInteractor(),
                new computeInteractors(),
                new encryptionInteractor(),
                new mcIdGetInteractors(),
                new UnicodeInteractor(),
                new MD5Interactor(),
                new FilesInteractor(),
                new xiaoMingEssInteractor(),
                new jrrpInteractor()
        );
    }
    public <T extends Plugin> void regInteractors(T plugin, Interactors<T>... interactors){
        for (Interactors<T> interactor : interactors) {
            this.registerInteractors(interactor, null, plugin);
        }

    }
    public void registerInteractors(Interactors interactors, InteractorCustomizer interactorCustomizer, Plugin plugin) {
        if (interactors instanceof PluginObject) {
            PluginObject pluginObject = (PluginObject) interactors;
            pluginObject.setPlugin(plugin);
            pluginObject.setXiaoMingBot(this.getXiaoMingBot());
        }
    }
}
