package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Utils.HttpUtil.HttpUtils;
import cn.qfys521.qfys521ToolBoxPlugin;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

@SuppressWarnings("all")
public class openAIInteracotr extends SimpleInteractors<qfys521ToolBoxPlugin> {
    @Filter("提问 {r:问题}")
    @Required("qfys521ToolBox.ai")
    public void aiQuestion(XiaoMingUser user, @FilterParameter("问题") String Question) {


        try {
            HttpUtils get = new HttpUtils();
            String request = get.post("https://api.kuxi.tech/openai/completions", "{ \"model\": \"text-davinci-003\", \"prompt\": \""+Question.replaceAll("\"","'")+"\", \"temperature\": 0 }");
            JSONObject json = JSONObject.parseObject(request);
            StringBuilder sb = new StringBuilder();
            JSONArray results = json.getJSONArray("choices");
            for (int i = 0; i < results.size(); i++) {
                String text = results.getJSONObject(i).getString("text");
                sb.append("\n").append(text);
            }
            user.sendMessage(String.valueOf(sb));
        } catch (Exception e) {
            var ex = e.toString();
            if (ex.length() > 30) {
                user.sendError("在过程中发生了异常: ");
                user.sendError(ex.substring(0, 50) + "\n and more...");
                e.printStackTrace();
            } else {
                user.sendError("发生了异常。请联系管理员.");
            }
        }
    }

    @Filter("提问v4 {r:问题}")
    @Required("qfys521ToolBox.ai")
    public void aiQuestionV4(XiaoMingUser user, @FilterParameter("问题") String Question) {


        try {
            HttpUtils get = new HttpUtils();
            String request = get.post("https://api.kuxi.tech/openai/chat", toStr(Question));
            JSONObject json = JSONObject.parseObject(request);
            StringBuilder sb = new StringBuilder();
            JSONArray results = json.getJSONArray("choices");
            for (int i = 0; i < results.size(); i++) {
                String text = JSONObject.parseObject(results.getJSONObject(i).getString("message")).getString("content");
                sb.append("\n").append(text);
            }
            user.sendMessage(String.valueOf(sb));
        } catch (Exception e) {
            var ex = e.toString();
            if (ex.length() > 30) {
                user.sendError("在过程中发生了异常: ");
                user.sendError(ex.substring(0, 50) + "\n and more...");
                e.printStackTrace();
            } else {
                user.sendError("发生了异常。请联系管理员.");
            }
        }
    }



        public String toStr(String message){
        return "{ \"model\": \"gpt-4\", \"messages\": [ { \"role\": \"user\", \"content\": \""+message.replaceAll("\"","'")+"\" } ], \"temperature\": 0 }";
        }
    public String toAIStr(String message){
        return "{\"role\":\"assistant\",\"content\":\""+message+"\"}";
    }

        public String getStr(String AIJson){
        JSONArray j = JSONObject.parseObject(AIJson).getJSONArray("data");
        StringBuilder sb = new StringBuilder();
            for (Object o : j) {
                String msg = JSONObject.parseObject((String) o).getString("content");
                sb.append(msg);
            }
        return sb.toString();
    }
    HashMap<Integer, String> map = new HashMap<>();

/*
    //@Filter("chat")
    //@Required("qfys521ToolBox.ai.chat")
    public void aiChat(XiaoMingUser user) throws InterruptedException {
        user.sendMessage("现在起，你的所有回话将会被作为对话上传openAI，请谨慎发言.");
        while (!user.nextMessage().equals("退出")){
            try {
                map.put(map.size()+1,toStr(user.nextMessage().toString()));
                HttpUtils get = new HttpUtils();
                //String request = get.post("https://api.kuxi.tech/openai/chat", "{ \"data\": [ { \"role\": \"user\", \"content\":\" " + user.nextMessage() + "\" }]}");
                if(map.size()!=0){
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < map.size(); i++) {
                        sb.append("{ \"data\":[" ).append(map.get(i+1)).append(",{ \"role\": \"user\", \"content\":\"\"}");
                    }
                    sb.append("]}");
                    String request = get.post("https://api.kuxi.tech/openai/chat", "{ \"data\": [ { \"role\": \"user\", \"content\":\" " + sb + "\" }]}");
                    map.put(map.size()+1,toAIStr(getStr(request)));
                    user.sendMessage(getStr(request));
                }
                else {
                    String request = get.post("https://api.kuxi.tech/openai/chat", "{ \"data\": [ { \"role\": \"user\", \"content\":\" " + user.nextMessage() + "\" }]}");
                    map.put(map.size()+1,toAIStr(getStr(request)));
                    user.sendMessage(getStr(request));
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
                user.sendMessage("发生了异常:InterruptedException");
                break;
            } catch (Exception e) {
                e.printStackTrace();
                user.sendMessage("发生了异常");
                e.printStackTrace();
            }
        }
    }

 */
}
