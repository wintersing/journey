package com.lt.journey.util;

import org.junit.Test;

import com.lt.journey.model.TrainParam;

import commons.utils.CommonsUtils;

public class Train {

	private static String path = "src/main/resources/apikey.properties";
	private static String url = CommonsUtils.getProperties(path, "Train_Url");

	public static String getTrainInfo(TrainParam trainParam) {
		String param = "r=train/trainTicket/getTickets";
		param += "&primary[departureDate]="+trainParam.getDepartureDate();
		param += "&primary[departureCityCode]="+trainParam.getDepartureCityCode();
		param += "&primary[departureCityName]="+trainParam.getDepartureCityName();
		param += "&primary[arrivalCityCode]="+trainParam.getArrivalCityCode();
		param += "&primary[arrivalCityName]="+trainParam.getArrivalCityName();
		param += "&primary[start]="+trainParam.getStart();
		param += "&primary[limit]="+trainParam.getLimit();
		
		String ret = HttpRequest.sendGet(url, param);
		
		return CommonsUtils.decodeUnicode(ret);
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
		String trainInfo = getTrainInfo(trainParam);
		System.out.println(trainInfo);
	}
}
