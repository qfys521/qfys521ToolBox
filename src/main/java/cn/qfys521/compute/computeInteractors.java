package cn.qfys521.compute;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521UtilPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * 复杂计算器
 *
 * @author 崔素强
 * @url https://blog.csdn.net/cuisuqiang/article/details/41081635
 */
public class computeInteractors extends SimpleInteractors<qfys521UtilPlugin> {
    @Filter("简单计算 {text}")
    @Required("qfys521Util.sum")
    public static void main(XiaoMingUser user,
                            @FilterParameter("text") String text) {
        // 规则，只能出现数字和加减乘除符号，最前和最后都是数字，即字符串能有效计算的
//        String text = "30*1+4*2*10-10+40/20";
        try {
            // 计算内容分割
            List<String> numList = new ArrayList<String>();
            int splitIndex = 0;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    numList.add(text.substring(splitIndex, i));
                    numList.add(c + "");
                    splitIndex = i + 1;
                }
            }
            // 因为使用符号做判断，增加前一位和符号，所以最后一位数字不会在循环里处理
            numList.add(text.substring(splitIndex));

            //System.out.println("====分割后====");
            for (int i = 0; i < numList.size(); i++) {
                //System.out.println(i + " -> " + numList.get(i));
            }

            // 先做乘除计算
            List<String> list = new ArrayList<String>();
            Integer temp = null; // 用于做乘除计算临时变量
            for (int i = 1; i < numList.size(); i += 2) { // 这里只循环运算符号
                if ("+".equals(numList.get(i)) || "-".equals(numList.get(i))) {
                    if (null != temp) { // 存在临时变量，说明前面进行过乘除计算
                        list.add(temp.toString());
                        temp = null;
                    } else {
                        list.add(numList.get(i - 1));
                    }
                    list.add(numList.get(i)); // 把符号加进去
                    if (i == numList.size() - 2) { // 处理到最后时遇到直接处理

                        list.add(numList.get(i + 1));


                    }
                } else if ("*".equals(numList.get(i))) {
                    if (null == temp) {
                        temp = Integer.parseInt(numList.get(i - 1)) * Integer.parseInt(numList.get(i + 1));
                    } else {
                        temp = temp * Integer.parseInt(numList.get(i + 1));
                    }
                    if (i == numList.size() - 2) { // 处理到最后时遇到直接处理
                        list.add(temp.toString());
                        temp = null;
                    }
                } else if ("/".equals(numList.get(i))) {
                    if (null == temp) {
                        temp = Integer.parseInt(numList.get(i - 1)) / Integer.parseInt(numList.get(i + 1));
                    } else {
                        temp = temp / Integer.parseInt(numList.get(i + 1));
                    }
                    if (i == numList.size() - 2) { // 处理到最后时遇到直接处理
                        list.add(temp.toString());
                        temp = null;
                    }
                }
            }
            //System.out.println("====乘除后====");
            for (int i = 0; i < list.size(); i++) {
                //System.out.println(i + " -> " + list.get(i));
            }

            // 再做加减计算
            Integer sum = Integer.parseInt(list.get(0)); // 第一位不会在循环里处理
            for (int i = 1; i < list.size(); i += 2) { // 这里只循环运算符号
                if ("+".equals(list.get(i))) {
                    sum += Integer.parseInt(list.get(i + 1));
                } else if ("-".equals(list.get(i))) {
                    sum -= Integer.parseInt(list.get(i + 1));
                }
            }

            //System.out.println("====最终值====");
            // 打印结果
            user.sendMessage("最终值为:"+sum);
        }catch (Exception e){
            user.sendError("发生错误力！请不要大力撅机器人(悲).");
            user.sendWarning("被撅的时候发生了以下了问题(惨兮兮):"+e);
        }
    }
}