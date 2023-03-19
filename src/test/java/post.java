import cn.qfys521.Utils.HttpUtil.HttpUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class post {
    public static void main(String[] args) {
        try {
            HttpUtils get = new HttpUtils();
            String request = get.post("https://api.kuxi.tech/openai/chat", "{ \"model\": \"gpt-4\", \"messages\": [ { \"role\": \"user\", \"content\": \"你好?\" } ], \"temperature\": 0 }");
            System.out.println(request);
            JSONObject json = JSONObject.parseObject(request);
            System.out.println(json.toString());
            StringBuilder sb = new StringBuilder();
            JSONArray results = json.getJSONArray("choices");
            System.out.println(results);
            for (int i = 0; i < results.size(); i++) {
                String text = JSONObject.parseObject(results.getJSONObject(i).getString("message")).getString("content");
                sb.append("\n").append(text);
                System.out.println(text);
            }
            System.out.println(sb);
        } catch (Exception e) {
            var ex = e.toString();
            if (ex.length() > 30) {
                System.out.println("在过程中发生了异常: ");
                System.out.println(ex.substring(0, 50) + "\n and more...");
                e.printStackTrace();
            } else {
                System.out.println("发生了异常。请联系管理员.");
            }
        }
    }
}
