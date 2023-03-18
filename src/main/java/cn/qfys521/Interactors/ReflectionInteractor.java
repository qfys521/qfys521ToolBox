package cn.qfys521.Interactors;


import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@SuppressWarnings("all")
public class ReflectionInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {
    StringBuilder sb = new StringBuilder();

    @Filter("类查询 {rn:class}")
    public void main(XiaoMingUser user,
                     @FilterParameter("class") String c) throws Exception {
        String name;
        name = c;
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0)
            sb.append("class ").append(name);
        if (supercl != null && supercl != Object.class)
            sb.append(" extends " + " ").append(supercl.getName());
        sb.append("\n{\n");
        printConstructors(cl);
        sb.append("\n");
        printMethods(cl);
        sb.append("\n");
        printFields(cl);
        sb.append(" } " + "\n");
        user.sendMessage(String.valueOf(sb));
    }


    public void printConstructors(Class cl) throws Exception {
        try {


            Constructor[] constructors = cl.getDeclaredConstructors();

            for (Constructor c : constructors) {
                String name = c.getName();
                sb.append("   ");
                String modifiers = Modifier.toString(c.getModifiers());
                if (modifiers.length() > 0)
                    sb.append(modifiers).append(" ").append("\n");
                sb.append(name).append("(");
                Class[] parmaTypes = c.getParameterTypes();
                for (int j = 0; j < parmaTypes.length; j++) {
                    if (j > 0)
                        sb.append(", ");
                    sb.append(parmaTypes[j].getName());
                }
                sb.append(");" + "\n");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }


    public void printMethods(Class cl) throws Exception {
        try {


            Method[] methods = cl.getDeclaredMethods();

            for (Method m : methods) {
                Class retType = m.getReturnType();
                String name = m.getName();

                sb.append("    ");
                String modifiers = Modifier.toString(m.getModifiers());
                if (modifiers.length() > 0)
                    sb.append(modifiers).append(" ");
                sb.append(retType.getName()).append(" ").append(name).append("(");

                Class[] paramTypes = m.getParameterTypes();
                for (int j = 0; j < paramTypes.length; j++) {
                    if (j > 0)
                        sb.append("'");
                    sb.append(paramTypes[j].getName()).append(" ");
                }
                sb.append(");" + "\n");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }


    public void printFields(Class cl) throws Exception {
        try {


            Field[] fields = cl.getDeclaredFields();

            for (Field f : fields) {
                Class type = f.getType();
                String name = f.getName();
                sb.append("   ");
                String modifiers = Modifier.toString(f.getModifiers());
                if (modifiers.length() > 0)
                    sb.append(modifiers).append(" ");
                sb.append(type.getName()).append(" ").append(name).append(";").append("\n");
            }

        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}

