package cn.codethink.qfys521;


import cn.chuanwise.xiaoming.plugin.JavaPlugin;
import cn.codethink.qfys521.GhenshenImpact.genshenImpactInteractor;
import cn.codethink.qfys521.compute.computeInteractors;
import cn.codethink.qfys521.encryption.MD5Util;
import cn.codethink.qfys521.encryption.UnicodeUtil;
import cn.codethink.qfys521.encryption.encryptionInteractor;
import cn.codethink.qfys521.minecraft.*;
import cn.codethink.qfys521.phigros.Songs;
import cn.codethink.qfys521.phigros.phigrosInteractors;
import cn.codethink.qfys521.xiaoming.TimedTask;
import cn.codethink.qfys521.xiaoming.quickstop;

/**
 * 插件主类
 * 类的全限定名要和资源文件 xiaoming.json 或 plugin.json 中的 main 完全相同
 *
 * @author Chuanwise
 * @version 1.0-SNAPSHOT
 */
public class qfys521UtilPlugin extends JavaPlugin {

    /**
     * 插件具备 static final 的名为 INSTANCE 的属性时，小明会首先查看其值是否</br>
     * 实现了 {@link cn.chuanwise.xiaoming.plugin.Plugin} 接口，如果实现</br>
     * 则取出并作为本插件加载。如果不是，或为 null，则小明将调用默认的无参构造方法
     * 构造一个插件主类的对象。
     */
    private static final qfys521UtilPlugin INSTANCE = new qfys521UtilPlugin();

    /** 获取插件实例 */
    public static qfys521UtilPlugin getInstance() {
        return INSTANCE;
    }


    /** 插件启动时的回调方法 */
    @Override
    public void onEnable() {
        getXiaoMingBot().getInteractorManager().registerInteractors(new genshenImpactInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new phigrosInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new Songs(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new computeInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new encryptionInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new mcIdGetInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new quickstop(),this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new UnicodeUtil(),this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new MD5Util(),this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new TimedTask(),this);
    }

}
