package com.lt.journey.util;

import java.util.Map;

import org.junit.Test;

import com.lt.journey.model.HotelParam;
import com.lt.journey.model.JourneyParam;

import commons.utils.CommonsUtils;

public class JourneyInfo {

	private static String url = "http://api01.idataapi.cn:8000/sight/ctrip";
	private static String apikey = "zq71QLetvWkIEefHcNCV7MTq5NrVGPrj8A0rLYoo3jSEv5es8OGd7c3zAQ0o592p";

	public static void getJourneyInfo(JourneyParam journeyParam) {
		StringBuffer param = new StringBuffer();
		param.append("apikey=" + apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(journeyParam);
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
		JourneyParam journeyParam = new JourneyParam();
		journeyParam.setCityid("405");
		journeyParam.setSort("1");
		getJourneyInfo(journeyParam);
	}
}
