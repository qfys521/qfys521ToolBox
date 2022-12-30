package cn.codethink.qfys521.encryption;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Miracle Luna
 * @version 1.0
 * @date 2019/7/3 18:55
 */
public class Base64Util {

    final static Base64.Encoder encoder = Base64.getEncoder();
    final static Base64.Decoder decoder = Base64.getDecoder();

    Base64Util(String text) {
    }

    /**
     * 给字符串加密
     *
     * @param text
     * @return
     */
    static String encode(String text) {

        return encoder.encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 将加密后的字符串进行解密
     *
     * @param encodedText
     * @return
     */
    static String decode(String encodedText) {
        return new String(decoder.decode(encodedText), StandardCharsets.UTF_8);
    }
//
//     static void main(String[] args) {
//
//        String username = "Miracle Luna";
//        String password = "p@sSW0rd";
//
//
//        System.out.println("====  [加密后] 用户名/密码  =====");
//        System.out.println(Base64Util.encode(username));
//        System.out.println(Base64Util.encode(password));
//
//
//        System.out.println("\n====  [解密后] 用户名/密码  =====");
//        System.out.println(Base64Util.decode(Base64Util.encode(username)));
//        System.out.println(Base64Util.decode(Base64Util.encode(password)));
//    }
}
