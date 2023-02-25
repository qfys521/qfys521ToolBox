package cn.qfys521.Configs;
import cn.qfys521.Utils.DataUtil.yamlUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Config {
    yamlUtil yamlUtil = new yamlUtil();
    final String PATH = "./plugins/qfys521ToolBox/";

    Map<Object,Object> Config = yamlUtil.read();

    public Config() throws IOException {
    }


    //Crazy
    boolean CrazyEnabled = (boolean) Config.get("CrazyEnabled");
    public boolean isCrazyEnabled() {
        return CrazyEnabled;
    }
    public void setCrazyEnabled(boolean b) throws IOException {
        Map<Object, Object> maps = new HashMap<>();
        maps.put("CrazyEnabled",b);
        yamlUtil.write(maps);
    }
}
