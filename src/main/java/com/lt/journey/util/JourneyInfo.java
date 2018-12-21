package com.lt.journey.util;

import java.util.Map;

import org.junit.Test;

import com.lt.journey.model.JourneyParam;

import commons.utils.CommonsUtils;

public class JourneyInfo {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Journey_Url");
	private static String apikey = CommonsUtils.getProperties(path, "IDataAPI_APIKEY");

	public static String getJourneyInfo(JourneyParam journeyParam) {
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
		return CommonsUtils.decodeUnicode(ret);
	}
	
	@Test
	public void name() {
		JourneyParam journeyParam = new JourneyParam();
		journeyParam.setCityid("405");
		journeyParam.setSort("1");
		System.out.println(getJourneyInfo(journeyParam));
	}
}
