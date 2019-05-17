package com.lt.journey.util;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;
import org.springframework.ui.Model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.exception.MessageException;
import com.lt.journey.model.Hotel;
import com.lt.journey.model.HotelDes;
import com.lt.journey.model.HotelParam;

public class HotelInfo {
	private static Properties propertiesAll = CommonsUtils.getPropertiesAll("src/main/resources/apikey.properties");
//	private static Properties propertiesAll = CommonsUtils.getPropertiesAll("apikey.properties");
	
	private static final String url = propertiesAll.getProperty("Hotel_Url");
	private static final String apikey = propertiesAll.getProperty("IDataAPI_APIKEY");

	public static <T> List<T> getHotelInfo(HotelParam hotelParam, Model model, Class<T> clazz) throws MessageException {
		//拼接参数
		StringBuffer param = new StringBuffer();
		param.append("apikey=").append(apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(hotelParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param.append("&").append(key).append("=").append(map.get(key));
			}
		}
		
		//处理返回结果
		String dataStr = HttpRequest.sendGet(url, param.toString());
//		System.out.println(dataStr);
		JSONObject dataObj = JSON.parseObject(dataStr);
		String retcode = dataObj.getString("retcode");
		if (retcode.equals("100002")) {
			throw new MessageException("Search No Result");
		}
		String hotelListStr = dataObj.getJSONArray("data").toString();

		List<T> hotelList = JSONObject.parseArray(hotelListStr, clazz);

		String pageToken = dataObj.getString("pageToken");

		StringBuffer urlParam = new StringBuffer();
		urlParam.append("pageToken=").append(pageToken);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null && !key.equals("pageToken")) {
				urlParam.append("&").append(key).append("=").append(map.get(key));
			}
		}

		//将数据放入model中
		if (model != null) {
			model.addAttribute("hotelList", hotelList);
			model.addAttribute("hotelParam", hotelParam);
			boolean hasNext = dataObj.getBoolean("hasNext"); 
			if (hasNext == true) {
				model.addAttribute("hasNext", "1");
			} else {
				model.addAttribute("hasNext", "0");
			}
			model.addAttribute("urlParam", urlParam);
		}
		
		return hotelList;
	}
	
	public static HotelDes getHotelDesInfo(HotelParam hotelParam) {
		//拼接参数
		StringBuffer param = new StringBuffer();
		param.append("apikey=").append(apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(hotelParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param.append("&").append(key).append("=").append(map.get(key));
			}
		}
		
		//处理返回结果
		String dataStr = HttpRequest.sendGet(url, param.toString());
		JSONObject dataObj = JSON.parseObject(dataStr);
//		System.out.println(dataObj);
		JSONArray hotelList = dataObj.getJSONArray("data");
		
		HotelDes hotelDes = null;
		for (Object obj_ : hotelList) {
			if (obj_ instanceof JSONObject) {
				JSONObject obj = (JSONObject) obj_;
				String id = obj.getString("id");
				if (hotelParam.getId().equals(id)) {
					hotelDes = JSONObject.parseObject(obj+"", HotelDes.class);
//					model.addAttribute(hotelDes);
					break;
				}
			}
		}
		
		return hotelDes;
	}

	@Test
	public void name() throws MessageException {//23.40800373，113.39481756
		HotelParam hotelParam = new HotelParam();
		hotelParam.setLat("23.40800373");
		hotelParam.setLon("113.39481756");
		hotelParam.setDistance("5km");
		getHotelInfo(hotelParam, null, Hotel.class);
//		System.out.println(hotelList);
	}

}