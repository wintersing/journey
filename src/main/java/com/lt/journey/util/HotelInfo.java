package com.lt.journey.util;

import org.apache.http.client.methods.HttpGet;

public class HotelInfo {

	private static String URL = "http://open.zhuna.cn/api/gateway.php?method=search&必选参数%7C可选参数";
	
	public void getHotelInfo() {
		HttpGet httpGet = new HttpGet(URL);
	}
}
