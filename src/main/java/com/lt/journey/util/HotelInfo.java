package com.lt.journey.util;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.Hotel;
import com.lt.journey.model.HotelParam;

public class HotelInfo {
	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Hotel_Url");
	private static String apikey = CommonsUtils.getProperties(path, "IDataAPI_APIKEY");

	public static List<Hotel> getHotelInfo(HotelParam hotelParam) {
		StringBuffer param = new StringBuffer();
		param.append("apikey=" + apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(hotelParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param.append("&" + key + "=" + map.get(key));
			}
		}
		String dataStr = HttpRequest.sendGet(url, param.toString());
		JSONObject dataObj = JSON.parseObject(dataStr);
		String hotelListStr = dataObj.getJSONArray("data") + "";
		List<Hotel> hotelList = JSONObject.parseArray(hotelListStr, Hotel.class);
		return hotelList;
	}

	@Test
	public void name() {
		HotelParam hotelParam = new HotelParam();
		hotelParam.setCity("景德镇");
		List<Hotel> hotelInfo = getHotelInfo(hotelParam);
		System.out.println(hotelInfo);
	}
}






