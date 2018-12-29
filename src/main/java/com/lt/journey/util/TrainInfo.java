package com.lt.journey.util;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.ResObj;
import com.lt.journey.model.Train;
import com.lt.journey.model.TrainParam;

public class TrainInfo {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Train_Url");

	/**
	 * @param trainParam
	 * @param isCount
	 * @return
	 */
	public static ResObj getTrainInfo(TrainParam trainParam) {
		String param = "r=train/trainTicket/getTickets";
		param += "&primary[departureDate]=" + trainParam.getDepartureDate();
		param += "&primary[departureCityCode]=" + trainParam.getDepartureCityCode();
		param += "&primary[departureCityName]=" + trainParam.getDepartureCityName();
		param += "&primary[arrivalCityCode]=" + trainParam.getArrivalCityCode();
		param += "&primary[arrivalCityName]=" + trainParam.getArrivalCityName();
		param += "&start=" + trainParam.getStart();
		param += "&limit=" + trainParam.getLimit();
		String dataStr = HttpRequest.sendGet(url, param);
		
		JSONObject dataObj = JSON.parseObject(dataStr);
		
		JSONObject trainObj = dataObj.getJSONObject("data");
		
		ResObj resObj = new ResObj();
		
		if (trainParam.getLimit() == 0) {
			Integer count = trainObj.getInteger("count");
			Integer maxPage = (int) Math.ceil(count/10.0);
			trainParam.setMaxPage(maxPage);
			resObj.setTrainParam(trainParam);
			if (count == 0) {
				return resObj;
			}
		}
		JSONArray trainObjList = trainObj.getJSONArray("list");
		JSONArray trainObjList_ = new JSONArray();
		List<Train> trainList = null;
		if (trainParam.getLimit() == 0) {
			int i = 0;
			for (Object trainObj1 : trainObjList) {
				trainObjList_.add(trainObj1);
				++i;
				if (i == 10) {
					break;
				}
			}
			trainList = JSONObject.parseArray(trainObjList_+"", Train.class);
			trainParam.setLimit(10);
		} else {
			trainList = JSONObject.parseArray(trainObjList+"", Train.class);
		}
		resObj.setDataList(trainList);
		resObj.setTrainParam(trainParam);
		return resObj;
	}

	@Test
	public void name() {
		System.out.println(Math.ceil(4.0));
	}
}
