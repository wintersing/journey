package com.lt.journey.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

public class TouristSpots {
//	private static String showapi_appid = "82310";
//	private static String showapi_sign = "25381cb456f645c087fc0a551c4dc88e";
//	private static final String URL = "http://route.showapi.com/268-4?showapi_appid=" + showapi_appid + "&cityId=226&showapi_sign="
//			+ showapi_sign;
	private static String ak = "uKxWBegMAqV6TIZ92QaqF9kid6QYT3Qg";
	private static String output = "json";
	private static final String URL = "http://api.map.baidu.com/telematics/v3/travel_attractions?id=yiheyuan&ak=" + ak
			+ "&output=" + output;
//	private static final String URL = "http://v.juhe.cn/tour_v2.0/jingqushuju.php?&area=%E8%8B%8F%E5%B7%9E&name=%E8%8B%8F%E5%B7%9E%E5%9B%AD%E6%9E%97&key=你申请的key";

	public static void main(String path[]) throws Exception {
		URL u = new URL(URL);
		InputStream in = u.openStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			byte buf[] = new byte[1024];
			int read = 0;
			while ((read = in.read(buf)) > 0) {
				out.write(buf, 0, read);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		byte b[] = out.toByteArray();
		System.out.println(new String(b, "utf-8"));
	}
}
