package cn.codethink.qfys521.minecraft;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.codethink.qfys521.qfys521UtilPlugin;

public class mcIdGetInteractors extends SimpleInteractors<qfys521UtilPlugin> {
    @Filter("(getID|id获取|获取id|IDget) {rn:Name}")
    @Required("mclib.getidPeremission")
    public void main(XiaoMingUser user,@FilterParameter("Name")String Name){
        all all = new all();
        String something = all.getInformaction(Name);
        if (something == null){
            user.sendMessage("无法获取该ID，请检查您输入内容是否正确或者该物品/魔咒/效果/生物群系等是否存在。");
        }else{
            user.sendMessage("名称:"+Name+"\n"+
                                        "ID:"+something);
        }
    }
}
