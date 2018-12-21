package com.lt.journey.util;

import java.util.ArrayList;

import org.junit.Test;

import com.lt.journey.model.TrainParam;
import com.lt.journey.model.TrainInfo;

import commons.utils.CommonsUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Train {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Train_Url");

	public static ArrayList<TrainInfo> getTrainInfo(TrainParam trainParam) {
		String param = "r=train/trainTicket/getTickets";
		param += "&primary[departureDate]=" + trainParam.getDepartureDate();
		param += "&primary[departureCityCode]=" + trainParam.getDepartureCityCode();
		param += "&primary[departureCityName]=" + trainParam.getDepartureCityName();
		param += "&primary[arrivalCityCode]=" + trainParam.getArrivalCityCode();
		param += "&primary[arrivalCityName]=" + trainParam.getArrivalCityName();
		param += "&primary[start]=" + trainParam.getStart();
		param += "&primary[limit]=" + trainParam.getLimit();

		String trainInfoStr = HttpRequest.sendGet(url, param);
		JSONObject trainInfoObj = JSONObject.fromObject(trainInfoStr);
		JSONArray trainInfoObjs = trainInfoObj.getJSONObject("data").getJSONArray("list");
		ArrayList<TrainInfo> trainInfoList = new ArrayList<TrainInfo>();
		for (int i = 0; i < trainInfoObjs.size(); i++) {
			JSONObject trainInfo = trainInfoObjs.getJSONObject(i);
			TrainInfo train = (TrainInfo) JSONObject.toBean(trainInfo, TrainInfo.class);
			trainInfoList.add(train);
		}
		return trainInfoList;
	}

	@Test
	public void name() {
		TrainParam trainParam = new TrainParam();
		trainParam.setDepartureCityCode("200");
		trainParam.setDepartureCityName("北京");
		trainParam.setArrivalCityCode("2500");
		trainParam.setArrivalCityName("上海");
		trainParam.setDepartureDate("2019-01-01");
		trainParam.setStart("0");
		trainParam.setLimit("0");
		ArrayList<TrainInfo> trainInfoList = getTrainInfo(trainParam);
		System.out.println(trainInfoList);
	}
}
