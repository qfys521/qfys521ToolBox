import cn.qfys521.Utils.DataUtil.yamlUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class yaml {
    public static void main(String... args) throws IOException {
        yamlUtil yaml = new yamlUtil();
        yaml.setPath("/home/qfys521/IdeaProjects/qfys521ToolBox/src/test/resources/yaml.yaml");
        List<String> l = new ArrayList<>();
        l.add("qfys521");
        l.add("Chuanwise");
        l.add("lyrinka");
        Map<Object, Object> map = new HashMap<>();
        map.put("name","qfys521");
        map.put("author",l);

        yaml.write(map);
    }

}
