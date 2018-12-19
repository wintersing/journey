package com.lt.journey.util;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 短信相关的工具类
 */
public class SMSUtils {

	private static final String NONCE = "123456";
	private static final String APP_SECRET = "d4f8b55cec47";
	private static final String APP_KEY = "39def0538236426a1965c197314d0eb2";
	private static final String templateId = "9534165";

	/**
	 * @param mobile 手机号码
	 * @return 是否有效
	 */
	public static final boolean isMobile(String mobile) {
		Pattern pattern = Pattern.compile("^((1[3578][0-9])|(14[57]))\\d{8}$");
		Matcher matcher = pattern.matcher("15779819842");
		return matcher.matches();
	}

	public static void main(String[] args) throws IOException {
		sendCode("15779819842");
	}

	/**
	 * 验证码类短信，注意：该短信中验证码不能自己生成，由网易云帮我们生成
	 * 
	 * @param mobile     手机号码
	 * @param templateId 验证码模板ID
	 * @return 是否发短信验证码
	 */
	public static final String sendCode(String mobile) throws IOException {
		try {
			HttpPost httpPost = new HttpPost("https://api.netease.im/sms/sendcode.action");

			String currentTime = String.valueOf(new Date().getTime() / 1000L);
			String checkSum = CheckSumBuilder.getCheckSum(APP_SECRET, NONCE, currentTime);

			// set header
			httpPost.setHeader("AppKey", APP_KEY);
			httpPost.setHeader("CurTime", currentTime);
			httpPost.setHeader("Nonce", NONCE);
			httpPost.setHeader("CheckSum", checkSum);
			httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

			// set data
			List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();
			nameValuePairList.add(new BasicNameValuePair("mobile", mobile));
			nameValuePairList.add(new BasicNameValuePair("templateid", templateId));
			httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairList, "utf-8"));

			// start request
			CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
			HttpResponse httpResponse = closeableHttpClient.execute(httpPost);
			String ret = EntityUtils.toString(httpResponse.getEntity(), "utf-8");

			String code = JSONObject.fromObject(ret).getString("obj");

			System.out.println(ret);

			return code;
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
