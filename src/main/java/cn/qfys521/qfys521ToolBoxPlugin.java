package cn.qfys521;


import cn.chuanwise.xiaoming.plugin.JavaPlugin;
import cn.qfys521.Interactors.*;
import cn.qfys521.Utils.DataUtil.yamlUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    final String PLUGIN_ROOT = getDataFolder().getPath();

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
        DefaultConfig();
        getXiaoMingBot().getInteractorManager().registerInteractors(new ReflectionTest(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new pluginsInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new genshinImpactInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new computeInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new encryptionInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new mcIdGetInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new UnicodeInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new MD5Interactor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new FilesInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new xiaoMingEssInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new jrrpInteractor(), this);
    }

    public void DefaultConfig(){
        yamlUtil yamlUtil = new yamlUtil();
        File f = new File(PLUGIN_ROOT+"config.yml");
        yamlUtil.setPath(PLUGIN_ROOT+"config.yml");
        if(f.length()==0){
            List<String> l = new ArrayList<>();
            l.add("qfys521");
            l.add("Chuanwise");
            l.add("lyrinka");
            Map<Object, Object> map = new HashMap<>();
            map.put("name", "qfys521");
            map.put("author", l);
            try {
                yamlUtil.write(map);
            }catch (Exception e) {
                getLogger().error(e.toString());
            }
        }
    }
}
