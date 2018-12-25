package com.lt.journey.util;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.Journey;
import com.lt.journey.model.JourneyParam;

public class JourneyInfo {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Journey_Url");
	private static String apikey = CommonsUtils.getProperties(path, "IDataAPI_APIKEY");

	public static List<Journey> getJourneyInfo(JourneyParam journeyParam) {
		StringBuffer param = new StringBuffer();
		param.append("apikey=" + apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(journeyParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param.append("&" + key + "=" + map.get(key));
			}
		}
		String ret = HttpRequest.sendGet(url, param.toString());
		String dataStr = CommonsUtils.unicodeToString(ret);
		JSONObject dataObj = JSON.parseObject(dataStr);
		String journeyListStr = dataObj.getJSONArray("data") + "";
		List<Journey> journeyList = JSONObject.parseArray(journeyListStr, Journey.class);
		return journeyList;
	}
	
	@Test
	public void name() {
		JourneyParam journeyParam = new JourneyParam();
		journeyParam.setCityid("405");
		journeyParam.setSort("1");
		List<Journey> journeyInfo = getJourneyInfo(journeyParam);
		System.out.println(journeyInfo);
	}
}






