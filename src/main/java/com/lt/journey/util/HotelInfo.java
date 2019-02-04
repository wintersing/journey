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
		JSONObject dataObj = JSON.parseObject(dataStr);
//		System.out.println(dataObj);
		String hotelListStr = dataObj.getJSONArray("data") + "";

		List<HotelDes> hotelList = JSONObject.parseArray(hotelListStr, HotelDes.class);
//		// 将图片大于100kb的全部删除
//		List<Integer> remvoeIndex = new ArrayList<Integer>();
//		String[] imageUrls = null;
//		for (HotelDes hotelDes : hotelList) {
//			imageUrls = hotelDes.getImageUrls();
//			for (int i = 0; i < imageUrls.length; i++) {
//				long startTime=System.currentTimeMillis(); 
//				int imgUrlSize = CommonsUtils.getImgUrlSize(imageUrls[i]);
//				long endTime=System.currentTimeMillis();
//				System.out.println("程序运行时间： "+(endTime-startTime)+"ms"); 
//				if (imgUrlSize > 1024 * 100) {
//					remvoeIndex.add(i);
//				}
//			}
//			if (remvoeIndex.size() > 0) {
//				List<String> imgList = new ArrayList<String>();
//				for (int i = 0; i < imageUrls.length; i++) {
//					if (!remvoeIndex.contains(i)) {
//						imgList.add(imageUrls[i]);
//					}
//				}
//				String[] imgArr = imgList.toArray(imageUrls);
//				hotelDes.setImageUrls(imgArr);
//			} 
//		}

		Boolean hasNext = dataObj.getBoolean("hasNext");
		String pageToken = dataObj.getString("pageToken");

		String urlParam = "";
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null && key != "pageToken") {
				urlParam += "&" + key + "=" + map.get(key);
			}
		}
		urlParam += "&pageToken=" + pageToken;

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
	public void name() {//23.40800373，113.39481756
		HotelParam hotelParam = new HotelParam();
		hotelParam.setLat("23.40800373");
		hotelParam.setLon("113.39481756");
		hotelParam.setDistance("5km");
		getHotelInfo(hotelParam);
//		System.out.println(hotelList);
	}

}