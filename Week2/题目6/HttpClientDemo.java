package java05.nio01.homework;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClientDemo {

    public static void main(String[] args) {
        try {
            CloseableHttpClient client = HttpClients.createDefault();
            String url = "http://localhost:8801";
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = client.execute(httpGet);
            String res = EntityUtils.toString(response.getEntity());
            System.out.println("res = " + res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
