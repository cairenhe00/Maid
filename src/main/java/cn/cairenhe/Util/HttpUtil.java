package cn.cairenhe.Util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class HttpUtil {

    public static String get(HashMap<String, String> msg, String url) {

        return null;
    }

    public static String post(String url, Map<String, String> data){
        return null;
    }

    public static String test(HashMap<String, String> msg, String url) throws Exception{
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpResponse response = httpClient.execute(new HttpGet(url));
//        System.out.println(response.getStatusLine().getStatusCode());
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8") );


        return null;
    }

    public static void main(String args[]){
        try{
            HttpUtil.test(null,"https://www.baidu.com");
        }catch(Exception e){

        }
    }
}
