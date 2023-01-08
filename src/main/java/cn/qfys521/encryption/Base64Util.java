package cn.qfys521.encryption;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @version 1.0
 * @date 2023/1/8
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
     * @return encoder.encodeToString(text.getBytes(StandardCharsets.UTF_8)
     */
    static String encode(String text) {

        return encoder.encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 将加密后的字符串进行解密
     *
     * @param encodedText
     * @return new String(decoder.decode(encodedText), StandardCharsets.UTF_8)
     */
    static String decode(String encodedText) {
        return new String(decoder.decode(encodedText), StandardCharsets.UTF_8);
    }
}
