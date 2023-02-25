# qfys521ToolBox

### xiaoming Plugin - This Just is a Util (for user)

----
注册的监听器
```java
public class qfys521ToolBoxPlugin extends JavaPlugin {
    public void onEnable() {
        getXiaoMingBot().getInteractorManager().registerInteractors(new ReflectionTest(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new pluginsInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new genshinImpactInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new computeInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new encryptionInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new mcIdGetInteractors(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new UnicodeInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new MD5Interactor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new FilesInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new xiaoMingEssInteractor(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new jrrpInteractor(), this);
    }
}
```

----

指令列表
```text
1、Base64Decode  [文本内容]
2、Base64Encode  [文本内容]
3、FileInformation  [path]
4、ICP备案查询  [url]
5、MD5  [str]
6、Reader  [path]
7、URLCodeEncode  [text]
8、URLCoedDecode  [text]
9、UUID生成
10、UnicodeDecode  [unicodeEncode]
11、UnicodeEncode  [sourceData]
12、getID  [Name]
13、getPlayerUUID  [playerName]
14、jrrp|今日人品
15、plugins  info  [PluginName]
16、plugins  reload  [PluginName]
17、pl|plugins|插件|插件列表
18、say  [say]
19、time
20、一言
21、历史上的今天
22、天气  [地区]
23、安慰语句|求安慰
24、快速关闭小明
25、批量UUID生成  [数量]
26、抽卡  来[次数]发
27、提问  [问题]
28、星座运势  [星座]
29、来句毒鸡汤|毒鸡汤
30、来句社会经典语录|社会经典语录
31、来句舔狗|舔我
32、树脂计算工具  [nowCount]
33、短网址  [url]
34、简单计算  [text]
35、类查询  [class]
36、翻译  [内容]
```


[![Security Status](https://www.murphysec.com/platform3/v3/badge/1612070168264486912.svg?t=1)](https://www.murphysec.com/accept?code=7268dc904db6cfcd813bde7dc7ebc840&type=1&from=2&t=2)
