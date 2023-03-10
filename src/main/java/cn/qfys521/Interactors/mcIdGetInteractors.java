package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Utils.minecraft.algorithm.FuzzyMatcher;
import cn.qfys521.Utils.minecraft.algorithm.PrepopulatedList;
import cn.qfys521.Utils.minecraft.all;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.util.List;

/**
 * @author qfys521
 */
@SuppressWarnings("all")
public class mcIdGetInteractors extends SimpleInteractors<qfys521ToolBoxPlugin> {

    /**
     * 通过{@link cn.qfys521.Utils.minecraft}进行相关操作，详情请自行跳转{@link cn.qfys521.Utils.minecraft}
     *
     * @param user XiaoMingUser
     * @param Name Name
     */
    @Filter("(getID|id获取|获取id|IDget) {rn:Name}")
    @Required("mclib.getidPeremission")
    public void main(XiaoMingUser user, @FilterParameter("Name") String Name) {
        all all = new all();
        List<String> something = all.getInformation(Name);


        if (something.size() == 0) {
            user.sendMessage("无法找到关于\"" + Name + "\"的ID，请检查您输入内容是否正确或者该物品/魔咒/效果/生物群系等是否存在。");
            user.sendMessage("猜您想问:");
            String[] list = PrepopulatedList.getEverything();
            StringBuilder stringBuilder = new StringBuilder();
            FuzzyMatcher matcher = new FuzzyMatcher(list).setThreshold(75.0f).setLimit(10);
            a:
            for (int i = 0; i < 11; i++) {
                matcher.find(Name).forEach(t -> {
                    String sb = t.getKey() +
                            " （" +
                            t.getValue() + "）\n";
                    stringBuilder.append(sb);
                });
                user.sendMessage(String.valueOf(stringBuilder));
                break a;

            }
        } else {
            StringBuilder sb = new StringBuilder();
            for (String s : something) {
                sb.append(s);
                sb.append("\n");
            }
            user.sendMessage(
                    "ID:" + Name + "\n" + sb);
        }
    }
}
