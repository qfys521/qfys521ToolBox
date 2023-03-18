import cn.qfys521.Utils.DataUtil.yamlUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class yaml {
    private static final String PLUGIN_ROOT = "/home/qfys521/IdeaProjects/qfys521ToolBox/src/test/resources/";

    public static void main(String... args) throws IOException {
        File file = new File(PLUGIN_ROOT + "config.yml");
        yamlUtil yamlUtil = new yamlUtil();
        yamlUtil.setPath(PLUGIN_ROOT + "config.yml");
        if (file.length() == 0) {
            List<String> l = new ArrayList<>();
            l.add("qfys521");
            l.add("Chuanwise");
            l.add("lyrinka");
            Map<Object, Object> map = new HashMap<>();
            map.put("name", "qfys521");
            map.put("author", l);

            yamlUtil.write(map);
        }
    }

}
