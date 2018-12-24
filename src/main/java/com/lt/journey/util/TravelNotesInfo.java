package com.lt.journey.util;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.TravelNotes;
import com.lt.journey.model.TravelNotesParam;

public class TravelNotesInfo {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Travel_Notes_Url");
	private static String apikey = CommonsUtils.getProperties(path, "IDataAPI_APIKEY");

	public static List<TravelNotes> getTravelNotesInfo(TravelNotesParam notesParam) {
		String param = "apikey=" + apikey;
		Map<String, Object> map = CommonsUtils.beantoMap(notesParam);
		for (String key : map.keySet()) {
			if (map.get(key) != "" && map.get(key) != null) {
				param += "&" + key + "=" + map.get(key);
			}
		}
		String ret = HttpRequest.sendGet(url, param);
		String dataStr = CommonsUtils.unicodeToString(ret);
		JSONObject dataObj = JSON.parseObject(dataStr);
		String notesListStr = dataObj.getJSONArray("data") + "";
		List<TravelNotes> travelNotesList = JSONObject.parseArray(notesListStr, TravelNotes.class);
		System.out.println(dataStr);
		return travelNotesList;
	}

	@Test
	public void name() {
		TravelNotesParam notesParam = new TravelNotesParam();
		notesParam.setCityid("26");
		List<TravelNotes> travelNotesInfo = getTravelNotesInfo(notesParam);
		System.out.println(travelNotesInfo);
	}

}










