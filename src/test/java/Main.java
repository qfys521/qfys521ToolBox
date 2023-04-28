import cn.qfys521.Utils.HttpUtil.HttpUtils;
import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

public class Main {
    public static void main(String... args) {
        String PlayerName = "inorganic_salt";
        String tmp = "OfflinePlayer:" + PlayerName;
        UUID object = UUID.nameUUIDFromBytes(tmp.getBytes());
        String offline = object.toString();
        HttpUtils get = new HttpUtils();
        try {


            String request = get.getUrlData("https://api.mojang.com/users/profiles/minecraft/" + PlayerName);
            JSONObject json = JSONObject.parseObject(request);
            String online = json.getString("id");
            System.out.println("PlayerName:" + PlayerName + "\n" + "离线uuid为: " + offline.replaceAll("-", "") + "\n" + "正版uuid为: " + online);
        } catch (Exception e) {
            System.out.println("PlayerName:" + PlayerName + "\n" + "离线uuid为: " + offline.replaceAll("-", "") + "\n" + "啊这。。。。该玩家没有正版呢(悲)");

        }

    }
}
