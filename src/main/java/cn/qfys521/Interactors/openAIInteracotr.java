package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.PrivateXiaoMingUser;
import cn.qfys521.Utils.HttpUtil.HttpUtils;
import cn.qfys521.qfys521ToolBoxPlugin;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class openAIInteracotr extends SimpleInteractors<qfys521ToolBoxPlugin>{
    Map<Object,Object> assistantMap = new HashMap<>();
    Map<Object,Object> userMap = new HashMap<>();
    public String parseMessage(String role,String Message){
        return "{\"role\":\""+role+"\",\"content\":\""+Message+"\"}";
    }//这个是@paserToMap的util
    int tmp = 0;

    public String paserToMap(String j) throws IOException {
        var json = JSONObject.parseObject(j);//解析总json
        var code = json.getInteger("code");//提取code
        var msg = json.getString("msg");//提取msg
        var array = json.getJSONArray("data");
        /*
         * 提取data[]
         * [{"role":"assistant","content":"\n\nAs an AI language model, I am here to answer your questions. What would you like to know?"}]
         * {"role":"assistant","content":"\n\nAs an AI language model, I am here to answer your questions. What would you like to know?"}
         * role ==> "assistant"
         * content ==> "\n\nAs an AI language model, I am here to answer your questions. What would you like to know?"
         */
        for (int i = 0; i < array.size();i++) {
            var parseTmp = array.get(i).toString();//当前轮询的json
            var content = JSON.parseObject(parseTmp);//解析@parseTmp
            if(content.getString("role").equals("assistant")) {assistantMap.put(i,parseMessage("assistant",content.getString("content")));return content.getString("content");}//assistantMap
            else if (content.getString("role").equals("user")) {userMap.put(i,parseMessage("assistant",content.getString("content")));return content.getString("content");}//userMap
            else throw new IOException("role not is user/assistant OR unknown role value.");
        }
        return null;
    }
    @Filter("chat")
    @Required("qfys521ToolBox.ai.chat")
    public void chat(PrivateXiaoMingUser user){
        user.sendMessage("接下来您说的每一句话都将被作为参数递交给openai，在过程中您随时可以退出。");
        while (true){
            try {
                if (!user.nextMessage().toString().equals("退出")) break;
            } catch (InterruptedException e) {
                //TODO
            }
            HttpUtils httpUtils = new HttpUtils();
            try {
                String j = httpUtils.PostUrlData("https://api.kuxi.tech/openai/chat",parseMessage("user",user.nextMessage().toString()));
                if (tmp == 0){
                    paserToMap(parseMessage("user",user.nextMessage().toString()));
                    paserToMap(j);
                    this.tmp = 1;
                    user.sendMessage(parseMessage("user",user.nextMessage().toString()));
                }else {
                    for (int i = 0; i< JSONObject.parseObject(j).getJSONArray("data").size(); i++) {
                        //TODO
                    }
                }



            } catch (Exception e) {
                //TODO
            }
        }
    }
}
