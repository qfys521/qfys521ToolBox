package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Configs.Config;
import cn.qfys521.Utils.DateUtil.DateUtil;
import cn.qfys521.Utils.Exception.CrazyThursdayException;
import cn.qfys521.Utils.Exception.NotThursdayException;
import cn.qfys521.Utils.ForwardMessageUtil.ForwardMessageBuilder;
import cn.qfys521.Utils.HttpUtil.getURLData;
import cn.qfys521.Utils.encryption.URLCodeUtil;
import cn.qfys521.qfys521ToolBoxPlugin;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.mamoe.mirai.message.data.ForwardMessage;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * @author qfys521
 */
@SuppressWarnings("all")
public class xiaoMingEssInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {
    /**
     * say 等效于 echo
     *
     * @param user XiaoMingUser
     * @param say  say
     */
    @Filter("say {rn:say}")
    @Required("core.say")
    public void say(XiaoMingUser user, @FilterParameter("say") String say) {
        user.sendMessage(say);
    }

    /**
     * 当前时间
     *
     * @param user XiaoMingUser
     */
    @Filter("(time|时间)")
    public void ntimes(XiaoMingUser user) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        user.sendMessage("now is: " + sdf.format(date));
    }

    /**
     * 原版的等待过于缓慢，板寸文件后进行抛弃所有任务强制退出
     *
     * @param user XiaoMingUser
     */
    @Filter("快速关闭小明")
    @Required("qfys521ToolBox.admin.quickstop")
    public void stop(XiaoMingUser user) {
        xiaoMingBot.getFileSaver().save();
        user.sendMessage("xiaoMingBot.getFileSaver().save()");
        System.exit(0);
    }

    /**
     * @param user XiaoMingUser
     * @throws Exception IOE
     */
    @Filter("一言")
    public void yiyan(XiaoMingUser user) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/yiyan/api.php");
        user.sendMessage(request);
    }

    /**
     * @param user XiaoMingUser
     * @throws Exception IOE
     */
    @Filter("来句舔狗|舔我")
    public void tiangou(XiaoMingUser user) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/dog/api.php");
        user.sendMessage(request);
    }

    /**
     * @param user XiaoMingUser
     * @throws Exception IOE
     */
    @Filter("来句毒鸡汤|毒鸡汤")
    public void du(XiaoMingUser user) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/dutang/api.php");
        user.sendMessage(request);
    }

    /**
     * @param user XiaoMingUser
     * @throws Exception IOE
     */
    @Filter("来句社会经典语录|社会经典语录")
    public void yvlu(XiaoMingUser user) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/yulu/api.php");
        user.sendMessage(request);
    }

    /**
     * @param user XiaoMingUser
     * @param url  url
     * @throws Exception IOE
     */
    @Filter("ICP备案查询 {url}")
    public void icp(XiaoMingUser user, @FilterParameter("url") String url) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/icp/api.php?url=" + url);
        JSONObject json = JSONObject.parseObject(request);
        String code = json.getString("code");
        String name = json.getString("name");
        String nature = json.getString("nature");
        String icp = json.getString("icp");
        String site_name = json.getString("site_name");
        String site_index = json.getString("site_index");
        String site_time = json.getString("site_time");
        StringBuilder sb = new StringBuilder();
        if (Objects.equals(code, "201")) {
            user.sendError(json.getString("msg"));
        } else {
            user.sendMessage(
                    "主办单位名称: " + name + "\n" +
                            "主办单位性质: " + nature + "\n" +
                            "网站备案/许可证号: " + icp + "\n" +
                            "网站名称: " + site_name + "\n" +
                            "网站首页网址: " + site_index + "\n" +
                            "审核时间: " + site_time);
        }
    }

    /**
     * @param user XiaoMingUser
     * @throws Exception IOE
     */
    @Filter("历史上的今天")
    public void history(XiaoMingUser user) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("https://api.oick.cn/lishi/api.php");
        JSONObject json = JSONObject.parseObject(request);
        String code = json.getString("code");
        StringBuilder sb = new StringBuilder();
        if (Objects.equals(code, "-1")) {
            user.sendError(json.getString("msg"));
        } else {
            String day = json.getString("day");
            JSONArray results = json.getJSONArray("result");
            for (int i = 0; i < results.size(); i++) {
                String date = results.getJSONObject(i).getString("date");
                String title = results.getJSONObject(i).getString("title");
                sb.append("\n").append(date).append(" : ").append(title);
            }
            user.sendMessage("今天为:" + day + "\n" + "历史上的今天:" + sb);
        }
    }

    /**
     * @param user     XiaoMingUser
     * @param Question Question
     * @throws Exception IOE
     */
    @Filter("提问 {r:问题}")
    @Required("qfys521ToolBox.ai")
    public void aiQuestion(XiaoMingUser user, @FilterParameter("问题") String Question) {
        String qs1 = URLEncoder.encode(Question, StandardCharsets.UTF_8);
        getURLData get = new getURLData();
        String request = null;
        try {
            request = get.getUrlData("https://api.kuxi.tech/openai/completions?contents=" + qs1);
            JSONObject json = JSONObject.parseObject(request);
            StringBuilder sb = new StringBuilder();
            JSONArray results = json.getJSONArray("data");
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
                user.sendPrivateMessage(e.toString());
            } else {
                user.sendError(String.valueOf(e));
            }

        }
    }

    /**
     * @param user XiaoMingUser
     * @param text text
     * @throws Exception IOE
     */
    @Filter("翻译 {内容}")
    public void translation(XiaoMingUser user, @FilterParameter("内容") String text) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("http://yichen.api.z7zz.cn/api/fanyi.php?msg=" + text + "&hh=,");
        String[] requests = request.split(",");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < requests.length; i++) {
            stringBuilder
                    .append("\n")
                    .append(requests[i]);
        }
        user.sendMessage(stringBuilder.toString());
    }

    /**
     * @param user XiaoMingUser
     * @param diqu diqu
     * @throws Exception IOE
     */
    @Filter("天气 {地区}")
    public void weather(XiaoMingUser user, @FilterParameter("地区") String diqu) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("http://yichen.api.z7zz.cn/api/qqtq.php?msg=" + diqu + "&hh=,");
        String[] requests = request.split(",");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : requests) {
            stringBuilder
                    .append("\n")
                    .append(s);
        }
        user.sendMessage(stringBuilder.toString());
    }

    /**
     * @param user XiaoMingUser
     * @throws Exception IOE
     */
    @Filter("安慰语句|求安慰")
    public void anwei(XiaoMingUser user) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("http://yichen.api.z7zz.cn/api/Comforting.php?");
        user.sendMessage(request);
    }

    /**
     * @param user XiaoMingUser
     * @param url  url
     * @throws Exception IOE
     */
    @Filter("短网址 {rn:url}")
    public void duanwangzhi(XiaoMingUser user, @FilterParameter("url") String url) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("http://yichen.api.z7zz.cn/api/dwz.php?url=" + url);
        JSONObject jsonObject = JSONObject.parseObject(request);
        String code = jsonObject.getString("code");
        if (Objects.equals(code, "1000")) {
            JSONObject jsonObject1 = JSONObject.parseObject(jsonObject.getString("data"));
            user.sendMessage("您的短网址为: " + jsonObject1.getString("url"));
        } else {
            user.sendError("您的网址有误。");
        }
    }

    /**
     * @param user  XiaoMingUser
     * @param cishu cishu
     * @throws Exception IOE
     */
    @Filter("抽卡 来{次数}发")
    @Required("qfys521ToolBox.gs")
    public void chouka(XiaoMingUser user, @FilterParameter("次数") int cishu) throws Exception {
        if (cishu <= 80 && cishu > 0) {
            getURLData get = new getURLData();
            String request = get.getUrlData("http://yichen.api.z7zz.cn/api/Original_god.php?num=" + cishu);
            JSONObject j = JSONObject.parseObject(request);
            ForwardMessageBuilder forwardMessageBuilder = new ForwardMessageBuilder();
            if (!Objects.equals(j.getString("code"), "200")) {
                user.sendError(j.getString("error"));
            } else {
                String tmptotal = j.getString("total");
                // 解析抽卡3、4、5星角色的次数
                JSONObject total = JSONObject.parseObject(tmptotal);
                String r3All = total.getString("r3");
                String r4All = total.getString("r4");
                String r5All = total.getString("r5");
                int t = (int) (new Date().getTime() / 1000);
                forwardMessageBuilder
                        .add(user.getCode(), t, "您的总抽卡次数为： " + cishu)
                        .add(user.getCode(), t, "3星总数为: " + r3All)
                        .add(user.getCode(), t, "四星总数为： " + r4All)
                        .add(user.getCode(), t, "5星总数为: " + r5All);
                JSONArray jsonArray = j.getJSONArray("list");
                for (int i = 0; i < jsonArray.size(); i++) {
                    String name = jsonArray.getJSONObject(i).getString("huo");
                    String type = jsonArray.getJSONObject(i).getString("type");
                    if (Objects.equals(type, "r3")) {
                        type = "3星";
                    } else if (Objects.equals(type, "r4")) {
                        type = "4星";
                    } else {
                        type = "5星";
                    }
                    forwardMessageBuilder
                            .add(user.getCode(),
                                    (int) System.currentTimeMillis() / 1000,
                                    user.getName(),
                                    name + "(" + type + ")");

                }
            }
            ForwardMessage forwardMessage = forwardMessageBuilder.build();
            user.sendMessage("已尝试发送消息.");
            new Thread(() ->
            {
                user.sendMessage(forwardMessage);
            });
        } else {
            user.sendError("抽不了，怎么想都抽不了吧！");
        }
    }

    /**
     * @param user       XiaoMingUser
     * @param PlayerName PlayerName
     * @throws Exception IOE
     */
    @Filter("getPlayerUUID {playerName}")
    public void getPlayerUUID(XiaoMingUser user, @FilterParameter("playerName") String PlayerName) throws Exception {
        String tmp = "OfflinePlayer:" + PlayerName;
        UUID object = UUID.nameUUIDFromBytes(tmp.getBytes());
        String offline = object.toString();
        getURLData get = new getURLData();
        try {


            String request = get.getUrlData("https://api.mojang.com/users/profiles/minecraft/" + PlayerName);
            JSONObject json = JSONObject.parseObject(request);
            String online = json.getString("id");
            user.sendMessage("PlayerName:" + PlayerName + "\n" + "离线uuid为: " + offline.replaceAll("-", "") + "\n" + "正版uuid为:" + online);
        } catch (Exception e) {
            user.sendMessage("PlayerName:" + PlayerName + "\n" + "离线uuid为: " + offline.replaceAll("-", "") + "\n" + "啊这。。。。该玩家没有正版呢(悲)");

        }

    }

    /**
     * @param user XiaoMingUser
     * @param text text
     * @throws Exception IOE
     */
    @Filter("星座运势 {星座}")
    public void xz(XiaoMingUser user, @FilterParameter("星座") String text) throws Exception {
        getURLData get = new getURLData();
        String request = get.getUrlData("http://yichen.api.z7zz.cn/api/xingzuo.php?msg=" + text + "&hh=,");
        String[] requests = request.split(",");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < requests.length; i++) {
            stringBuilder
                    .append("\n")
                    .append(requests[i]);
        }
        user.sendMessage(stringBuilder.toString());
    }

    /**
     * @param user XiaoMingUser
     * @param text text
     */
    @Filter("URLCodeEncode {r:text}")
    public void urlEncode(XiaoMingUser user, @FilterParameter("text") String text) {
        URLCodeUtil urlCodeUtil = new URLCodeUtil();
        user.sendMessage(urlCodeUtil.URLCodeEncode(text));
    }

    /**
     * @param user XiaoMingUser
     * @param text text
     */
    @Filter("URLCoedDecode {r:text}")
    public void urlDecode(XiaoMingUser user, @FilterParameter("text") String text) {
        URLCodeUtil urlCodeUtil = new URLCodeUtil();
        user.sendMessage(urlCodeUtil.URLCodeDecode(text));
    }

    @Filter("testException")
    public void te(XiaoMingUser user) {
        if (new Config().isCrazyEnabled()) {
            throw new CrazyThursdayException("v我50！");
        } else {
            throw new NotThursdayException("今天不是星期四呢");
        }
    }

    @Filter("(v|V|微)(ivo|IVO|我)50")
    public void Crazy(XiaoMingUser user) {
        DateUtil dateUtil = new DateUtil();
        if (dateUtil.getWeekOfDate() == 4) {
            throw new CrazyThursdayException("v我50！");
        } else {
            throw new NotThursdayException("今天不是星期四呢");
        }

    }

    @Filter("关闭疯狂星期四异常")
    public void Crazyfalse(XiaoMingUser user) {
        new Config().setCrazyEnabled(false);
        xiaoMingBot.getFileSaver().save();
        user.sendMessage("已尝试关闭");
    }

    @Filter("开启疯狂星期四异常")
    public void Crazytrue(XiaoMingUser user) {
        new Config().setCrazyEnabled(true);
        xiaoMingBot.getFileSaver().save();
        user.sendMessage("已尝试开启");
    }
}
