import cn.qfys521.Utils.HttpUtil.HttpUtils;
import cn.qfys521.Utils.encryption.URLCodeUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class post {
    public static void main(String[] args) {
        var get = new HttpUtils();
        String request = null;
        try {
            request = get.post("https://api.kuxi.tech/openai/chat", "{ \"data\": [ { \"role\": \"user\", \"content\":\"你好啊\"},{ \"role\": \"user\", \"content\":\"\"}]}");
            System.out.println(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject json = JSONObject.parseObject(request);
        StringBuilder sb = new StringBuilder();
        JSONArray results = json.getJSONArray("data");
        for (int i = 0; i < results.size(); i++) {
            String text = results.getJSONObject(i).getString("content");
            sb.append("\n").append(text);
        }
        //{ "data": [ { "role": "user", "content": "现在,你的名字叫贾维斯,可以吗?" } ] }
    }

}
