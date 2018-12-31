import java.net.URL;
import java.net.URLConnection;

public class HttpRequest {
    public static String sendPost(String url, String param) {
        String result = "";
        try {
            RestfulHttpClient.HttpResponse response = RestfulHttpClient
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
        } catch (Exception e) {
            System.out.println("发送POST请求出现异常！" + e);
            e.printStackTrace();
        }
    }
}
