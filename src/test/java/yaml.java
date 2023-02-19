import cn.qfys521.Utils.DataUtil.yamlUtil;

import java.io.IOException;

public class yaml {
    public static void main(String... args) {
        yamlUtil yaml = new yamlUtil();
        yaml.setPath("/home/qfys521/IdeaProjects/qfys521ToolBox/src/test/resources/yaml.yaml");
        try {
            System.out.println(yaml.read());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
