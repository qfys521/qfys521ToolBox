package cn.qfys521.HttpUtil;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class getURLData {
    public String getURLDara(String Url) throws IOException {
        URL url = new URL(Url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
        InputStream is = connection.getInputStream();
        String Request = java.lang.String.valueOf(new InputStreamReader(is, StandardCharsets.UTF_8));
        return Request;
    }
}
