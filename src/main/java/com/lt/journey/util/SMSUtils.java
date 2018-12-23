package com.lt.journey.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.lt.commons.utils.CommonsUtils;

import net.sf.json.JSONObject;

/**
 * 短信相关的工具类
 */
public class SMSUtils {

	private static String path = "src/main/resources/apikey.properties";
	private static final String NONCE = CommonsUtils.getProperties(path, "SMS_NONCE");
	private static final String APP_SECRET = CommonsUtils.getProperties(path, "SMS_APP_SECRET");
	private static final String APP_KEY = CommonsUtils.getProperties(path, "SMS_APP_KEY");
	private static final String templateId = CommonsUtils.getProperties(path, "SMS_templateId");
	private static final String url = CommonsUtils.getProperties(path, "SMS_Url");

	/** 
	 * @param mobile 手机号码
	 * @return 是否有效
	 */
	public static final boolean isMobile(String mobile) {
		Pattern pattern = Pattern.compile("^((1[3578][0-9])|(14[57]))\\d{8}$");
		Matcher matcher = pattern.matcher("15779819842");
		return matcher.matches();
	}
	
	/**
	 * 验证码类短信，注意：该短信中验证码不能自己生成，由网易云帮我们生成
	 */
	public static final String sendCode(String mobile) {
		try {
			HttpPost httpPost = new HttpPost(url);

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
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Test
	public void name() {
		sendCode("15779819842");
	}

}
