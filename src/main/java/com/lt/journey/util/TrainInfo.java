package com.lt.journey.util;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.lt.journey.model.Train1;

import commons.utils.CommonsUtils;

public class TrainInfo {

	private static String url = "http://ws.webxml.com.cn/WebServices/TrainTimeWebService.asmx/getStationAndTimeByStationName";

	public static void getTrainInfo(String StartStation, String ArriveStation) {
		try {
			String param = "UserID=&StartStation=" + StartStation + "&ArriveStation=" + ArriveStation;
			String ret = HttpRequest.sendGet(url, param);
			System.out.println(ret);
			Train1 train = CommonsUtils.xmlToBean(ret, Train1.class);
			System.out.println(train);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("获取余票信息失败，请稍后再试");
		}
	}

	@Test
	public void name() {
		getTrainInfo("景德镇", "萍乡");
	}
}
