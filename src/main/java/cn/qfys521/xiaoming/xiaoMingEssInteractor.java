package cn.qfys521.xiaoming;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.HttpUtil.getURLData;
import cn.qfys521.qfys521ToolBoxPlugin;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;


public class xiaoMingEssInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {

    @Filter("say {rn:say}")
    @Required("core.say")
    public void say(XiaoMingUser user,
                    @FilterParameter("say") String say) {
        user.sendMessage(say);
    }

    @Filter("pl")
    @Required("core.plugins")
    public void pl(XiaoMingUser user) {
        Map<String, Plugin> plugins = xiaoMingBot.getPluginManager().getPlugins();
        Set<String> set = plugins.keySet();
        Iterator<String> i = set.iterator();
        StringBuilder sb = new StringBuilder();
        while (i.hasNext()) {
            sb.append("\n");
            sb.append(i.next());
        }
        user.sendMessage("======Plugins======" + sb);
    }

    @Filter("(time|时间)")
    public void ntimes(XiaoMingUser user) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        user.sendMessage("now is: " + sdf.format(date));
    }

    @Filter("快速关闭小明")
    @Required("qfys521ToolBox.admin.quickstop")
    public void stop(XiaoMingUser user) {
        xiaoMingBot.getFileSaver().save();
        user.sendMessage("xiaoMingBot.getFileSaver().save()");
        System.exit(0);
    }

    @Filter("一言")
    public void yiyan(XiaoMingUser user) throws IOException {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/yiyan/api.php");
        user.sendMessage(request);
    }
    @Filter("来句舔狗|舔我")
    public void tiangou(XiaoMingUser user) throws IOException {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/dog/api.php");
        user.sendMessage(request);
    }
    @Filter("来句毒鸡汤|毒鸡汤")
    public void du(XiaoMingUser user) throws IOException {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/dutang/api.php");
        user.sendMessage(request);
    }
    @Filter("来句社会经典语录|社会经典语录")
    public void yvlu(XiaoMingUser user) throws IOException {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/yulu/api.php");
        user.sendMessage(request);
    }
    @Filter("ICP备案查询 {url}")
    public void icp(XiaoMingUser user,@FilterParameter("url")String url) throws IOException {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/icp/api.php?url="+url);
        JSONObject json = JSONObject.parseObject(request);
        String code = json.getString("code");
        String name = json.getString("name");
        String nature = json.getString("nature");
        String icp = json.getString("icp");
        String site_name = json.getString("site_name");
        String site_index = json.getString("site_index");
        String site_time = json.getString("site_time");
        StringBuilder sb = new StringBuilder();
        if(Objects.equals(code, "201")){
            user.sendError(json.getString("msg"));
        }else{
            user.sendMessage(
                    "主办单位名称"+code+"\n"+
                            "主办单位性质"+nature+"\n"+
                            "网站备案/许可证号"+icp+"\n"+
                            "网站名称"+site_name+"\n"+
                            "网站首页网址"+site_index+"\n"+
                            "审核时间"+site_time);
        }
    }

    @Filter("历史上的今天")
    public void history(XiaoMingUser user) throws IOException{
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/lishi/api.php");
        JSONObject json = JSONObject.parseObject(request);
        String code = json.getString("code");
        String day = json.getString("day");
        String arr = json.getString("result").replaceAll("\\[","").replaceAll("]","");
        String[] result = arr.split(",");
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<result.length;i++) {
            JSONObject jsonObject = JSONObject.parseObject(result[i]);
            String date = jsonObject.getString("date");
            String title = jsonObject.getString("title");
            sb
                    .append(date)
                    .append(":")
                    .append(title);

        }
        if(Objects.equals(code, "-1")){
            user.sendError(json.getString("msg"));
        }else{
            user.sendMessage("今天为:"+day+"\n"+
                    "历史上的今天:"+sb
            );
        }
    }
}
