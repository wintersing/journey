package com.lt.journey.util;

import java.util.Map;

import org.junit.Test;

import com.lt.journey.model.HotelParam;

import commons.utils.CommonsUtils;

public class HotelInfo {

	private static String url = "http://api01.idataapi.cn:8000/hotel/idataapi";
	private static String apikey = "zq71QLetvWkIEefHcNCV7MTq5NrVGPrj8A0rLYoo3jSEv5es8OGd7c3zAQ0o592p";

	public static void getHotelInfo(HotelParam hotelParam) {
		StringBuffer param = new StringBuffer();
		param.append("apikey=" + apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(hotelParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param.append("&" + key + "=" + map.get(key));
			}
		}
		String ret = HttpRequest.sendGet(url, param.toString());
		System.out.println(ret);
	}
	
	@Test
	public void name() {
		HotelParam hotelParam = new HotelParam();
		hotelParam.setCity("景德镇");
		getHotelInfo(hotelParam);
	}
}
