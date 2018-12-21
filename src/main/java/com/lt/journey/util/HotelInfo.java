package com.lt.journey.util;

import java.util.Map;

import org.junit.Test;

import com.lt.journey.model.HotelParam;

import commons.utils.CommonsUtils;

public class HotelInfo {
	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Hotel_Url");
	private static String apikey = CommonsUtils.getProperties(path, "IDataAPI_APIKEY");

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
