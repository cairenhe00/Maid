package cn.cairenhe.Util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpUtil {

    public static String get(HashMap<String, String> msg, String url) {

        return null;
    }

    public static String post(String url, Map<String, String> data){
        return null;
    }

    public static String test(HashMap<String, String> map, String url) throws Exception{
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpResponse response = httpClient.execute(new HttpGet(url));
//        System.out.println(response.getStatusLine().getStatusCode());
//        System.out.println(EntityUtils.toString(response.getEntity(), "utf-8") );

        RequestConfig defaultRequestConfig = RequestConfig.custom().setSocketTimeout(3000).setConnectionRequestTimeout(3000).build();
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(defaultRequestConfig).build();

        HttpPost post = new HttpPost(url);
        post.setConfig(defaultRequestConfig);
        //inpur the key-value for post
        List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
        for (Map.Entry<String, String> entry :map.entrySet()){
            list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        HttpEntity ent = new UrlEncodedFormEntity(list, "utf-8");
        post.setEntity(ent);

        //implement the response
        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
            @Override
            public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
                int status = httpResponse.getStatusLine().getStatusCode();
                System.out.println(httpResponse.getEntity().toString());
                if(status >= 200 && status < 300){
                    HttpEntity entity = httpResponse.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                }else{
                    throw new ClientProtocolException("Unexcepted response status: " + status);
                }
            }
        };

        System.out.println(httpClient.execute(post, responseHandler));
        return null;
    }

    public static void main(String args[]){
        try{
            HttpUtil.test(null,"https://www.baidu.com");
        }catch(Exception e){

        }
    }
}
