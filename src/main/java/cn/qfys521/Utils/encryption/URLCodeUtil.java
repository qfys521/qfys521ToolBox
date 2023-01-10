package cn.qfys521.Utils.encryption;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("all")
public class URLCodeUtil {
    public String URLCodeEncode(Object obj) {
        String URLEncode = URLEncoder.encode(obj.toString(), StandardCharsets.UTF_8);
        return URLEncode;
    }

    public String URLCodeDecode(Object obj) {
        String URLDecode = URLDecoder.decode(obj.toString(), StandardCharsets.UTF_8);
        return URLDecode;
    }
}
