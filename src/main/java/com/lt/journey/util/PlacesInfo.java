package com.lt.journey.util;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.Places;
import com.lt.journey.model.PlacesDes;
import com.lt.journey.model.PlacesParam;
import com.lt.journey.model.ResObj;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class PlacesInfo {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Journey_Url");
	private static String apikey = CommonsUtils.getProperties(path, "IDataAPI_APIKEY");

	
	public static ResObj getPlacesInfo(PlacesParam placesParam) {
		ResObj resObj = new ResObj();
		StringBuffer param = new StringBuffer();
		param.append("apikey=" + apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(placesParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param.append("&" + key + "=" + map.get(key));
			}
		}
		String ret = HttpRequest.sendGet(url, param.toString());
//		String dataStr = CommonsUtils.unicodeToString(ret);
		JSONObject dataObj = JSON.parseObject(ret);
//		System.out.println(dataObj);
		String retcode = dataObj.getString("retcode");
		if (retcode.equals("100002")) {
			resObj.setRetcode("100");
			return resObj;
		}
		String placesListStr = dataObj.getJSONArray("data") + "";
		List<Places> placesList = JSONObject.parseArray(placesListStr, Places.class);

		resObj.setDataList(placesList);
		resObj.setPageToken(dataObj.getString("pageToken"));
		if (dataObj.getBooleanValue("hasNext") == true) {
			resObj.setHasNext("1");
		} else {
			resObj.setHasNext("0");
		}
		resObj.setPlacesParam(placesParam);
		
		return resObj;
	}
	
	public static ResObj getPlacesSingleInfo(PlacesParam placesParam) {
		ResObj resObj = new ResObj();
		StringBuffer param = new StringBuffer();
		param.append("apikey=" + apikey);
		Map<String, Object> map = CommonsUtils.beantoMap(placesParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param.append("&" + key + "=" + map.get(key));
			}
		}
		String ret = HttpRequest.sendGet(url, param.toString());
		JSONObject dataObj = JSON.parseObject(ret);
		String retcode = dataObj.getString("retcode");
		if (retcode.equals("100002")) {
			resObj.setRetcode("100");
			return resObj;
		}
		JSONArray placesList = dataObj.getJSONArray("data");

		for (Object obj_ : placesList) {
			if (obj_ instanceof JSONObject) {
				JSONObject obj = (JSONObject) obj_;
				String id = obj.getString("id");
				if (placesParam.getId().equals(id)) {
					PlacesDes placesDes = JSONObject.parseObject(obj+"", PlacesDes.class);
					resObj.setData(placesDes);
					break;
				}
			}
		}
		
		resObj.setPageToken(dataObj.getString("pageToken"));
		resObj.setRetcode(dataObj.getString("retcode"));
		if (dataObj.getBooleanValue("hasNext") == true) {
			resObj.setHasNext("1");
		} else {
			resObj.setHasNext("0");
		}
		resObj.setPlacesParam(placesParam);
		
		return resObj;
	}
	
	@Test
	public void name() {
		PlacesParam placesParam = new PlacesParam();
		placesParam.setCityid("405");
		placesParam.setSort("1");
		getPlacesInfo(placesParam);
//		System.out.println(placesList);
//		placesService.addJourney(placesInfo);
	}

//	@Autowired
//	private GeoPointDao geoPointDao;

//	@Test
//	public void name1() {
//		GeoPoint geoPoint = new GeoPoint();
//		geoPoint.setLat("12.4568413");
//		geoPoint.setLon("112.4568654");
////		geoPointDao.addGeoPoint(geoPoint);
//	}
	
//	@Autowired
//	private KeyValuesDao keyValuesDao;
//	@Test
//	public void name2() {
//		KeyValues keyValues= new KeyValues();
//		keyValues.setKey("ImageCount");
//		keyValues.setValue("0");
////		keyValuesDao.addKeyValues(keyValues);
//	}
}
