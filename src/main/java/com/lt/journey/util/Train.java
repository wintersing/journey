package com.lt.journey.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@SuppressWarnings("unused")
public class Train {
	private static String URL = "https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2018-12-13&leftTicketDTO.from_station=BJP&leftTicketDTO.to_station=SHH&purpose_codes=ADULT";
	
	public static void main(String[] args) {
		sendHttp();
	}
	/**
     * 发起一个http请求
     */
    public static void sendHttp(){
        URL url;
        int responsecode;
        HttpURLConnection urlConnection;
        BufferedReader reader;
        String line;
        try{
            //忽略Ssl(针对12306)
            SslUtils.ignoreSsl();
            //生成一个URL对象
            url=new URL(URL);
            /**
             * 这是为了防止12306对同一ip多次访问进行限制
             * 这里填的ip是暂时有效的，想要获取更多就得自己去找 搜索代理ip
             */
            System.getProperties().setProperty("proxySet", "true");
            System.setProperty("http.proxyHost", "120.78.15.63");  
            System.setProperty("http.proxyPort", "80"); 
            //打开URL
            urlConnection = (HttpURLConnection)url.openConnection();
            //伪造一个请求头 一般网页不用，有些网站会看你有没有请求头，比如 12306......
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:55.0) Gecko/20100101 Firefox/55.0"); 
            urlConnection.setRequestProperty("Host","kyfw.12306.cn");
            urlConnection.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            urlConnection.setRequestProperty("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
            urlConnection.setRequestProperty("Accept-Encoding","identity");
            urlConnection.setRequestProperty("Connection","keep-alive");
            urlConnection.setRequestProperty("Upgrade-Insecure-Requests","1");
            //获取服务器响应代码
            responsecode=urlConnection.getResponseCode();
            //假如响应代码为200，就是代表成功
            if(responsecode==200){
                reader=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
                while((line=reader.readLine())!=null){
                	JSONObject jSONObject = JSONObject.fromObject(line);
                	Object listObject=jSONObject.get("data");
                    jSONObject=JSONObject.fromObject(listObject);
                    JSONArray json=jSONObject.getJSONArray("result");
//                    存放火车列次的数组
                    String[] strs=new String[json.size()];
                    for (int i = 0; i < json.size(); i++) {
                        String str=json.getString(i);
                        String[] arr=str.split("|");
                        strs[i]=arr[3];
                    }
                    System.out.println(strs);
                    System.out.println(line);
                }
            }else{
                System.out.println("获取不到网页的源码，服务器响应代码为："+responsecode);
            }
        }catch(Exception e){
            System.out.println("获取不到网页的源码,出现异常："+e);
        }
    }
    
    
    
}
