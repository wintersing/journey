package com.lt.journey.util;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.HotelDes;
import com.lt.journey.model.HotelParam;
import com.lt.journey.model.ResObj;

public class HotelInfo {
	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Hotel_Url");
	private static String apikey = CommonsUtils.getProperties(path, "IDataAPI_APIKEY");

	public static ResObj getHotelInfo(HotelParam hotelParam) {
		String param = "apikey=" + apikey;
		Map<String, Object> map = CommonsUtils.beantoMap(hotelParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param += "&" + key + "=" + map.get(key);
			}
		}
		String dataStr = HttpRequest.sendGet(url, param);
//		System.out.println(dataStr);
		JSONObject dataObj = JSON.parseObject(dataStr);
		String hotelListStr = dataObj.getJSONArray("data") + "";
		
		List<HotelDes> hotelList = JSONObject.parseArray(hotelListStr, HotelDes.class);
		Boolean hasNext = dataObj.getBoolean("hasNext");
		String pageToken = dataObj.getString("pageToken");
		
		String urlParam = "";
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null && key != "pageToken") {
				urlParam += "&" + key + "=" + map.get(key);
			}
		}
		urlParam += "&pageToken" + pageToken;
		
		ResObj resObj = new ResObj();
		resObj.setDataList(hotelList);
		resObj.setPageToken("1");
		if (hasNext == true) {
			resObj.setHasNext("1");
		} else {
			resObj.setHasNext("0");
		}
		resObj.setParam(urlParam);
		return resObj;
	}

	@Test
	public void name() {
		HotelParam hotelParam = new HotelParam();
		hotelParam.setLon("117.58362");
		hotelParam.setLat("29.560271");
		hotelParam.setDistance("5km");
		hotelParam.setPageToken("40:WzE3ODQuMjM0ODIxOTcwNSwwLjcwMDU3NTc3LCJpZGF0YWFwaSIsIjgwMDQzNDM2Il0=");
		//40:WzE3ODQuMjM0ODIxOTcwNSwwLjcwMDU3NTc3LCJpZGF0YWFwaSIsIjgwMDQzNDM2Il0=
		//60:WzIxMjUuMTgyOTc0MDI5NSwwLjIsImlkYXRhYXBpIiwiMTA3Mjk4NTY4Il0=
		//80:WzIxOTYuNTE2MTQ3Njg2MSwwLjcyNTA0MzcsImlkYXRhYXBpIiwiODk0NDQxNzciXQ==
		//100:WzIzMDYuNTIwNDQ1Mzg3NSwwLjUzODUzMjE0LCJpZGF0YWFwaSIsIjc5ODk3MTE1Il0=
		ResObj resObj = getHotelInfo(hotelParam);
//		System.out.println(hotelList);
	}
}