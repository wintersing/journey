package com.lt.journey.util;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.commons.utils.CommonsUtils;
import com.lt.commons.utils.HttpRequest;
import com.lt.journey.model.Train;
import com.lt.journey.model.TrainParam;

public class TrainInfo {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Train_Url");

	public static List<Train> getTrainInfo(TrainParam trainParam) {
		String param = "r=train/trainTicket/getTickets";
		param += "&primary[departureDate]=" + trainParam.getDepartureDate();
		param += "&primary[departureCityCode]=" + trainParam.getDepartureCityCode();
		param += "&primary[departureCityName]=" + trainParam.getDepartureCityName();
		param += "&primary[arrivalCityCode]=" + trainParam.getArrivalCityCode();
		param += "&primary[arrivalCityName]=" + trainParam.getArrivalCityName();
		param += "&primary[start]=" + trainParam.getStart();
		param += "&primary[limit]=" + trainParam.getLimit();

		String dataStr = HttpRequest.sendGet(url, param);
		JSONObject dataObj = JSON.parseObject(dataStr);
		String trainListStr = dataObj.getJSONObject("data").getJSONArray("list") + "";
		List<Train> trainList = JSONObject.parseArray(trainListStr, Train.class);
		return trainList;
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
		List<Train> trainList = getTrainInfo(trainParam);
		System.out.println(trainList);
	}
}
