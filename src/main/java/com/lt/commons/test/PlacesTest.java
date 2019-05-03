package com.lt.commons.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.journey.exception.MessageException;
import com.lt.journey.model.Places;
import com.lt.journey.model.PlacesDes;
import com.lt.journey.model.PlacesParam;
import com.lt.journey.service.PlacesService;
import com.lt.journey.util.PlacesInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-*.xml","classpath*:mybatis-config.xml" })
public class PlacesTest {
	@Autowired
	private PlacesService placesService;


//	@Test
//	public void name() {
//		JSONObject dataObj = JSON.parseObject(dataStr);
//		String journeyListStr = dataObj.getJSONArray("data") + "";
//		List<Journey> journeyList = JSONObject.parseArray(journeyListStr, Journey.class);
//		journeyService.addJourney(journeyList);
////		System.out.println(journeyList);
//	}
	
	
	@Test
	public void name2() throws MessageException {
		String cityid = placesService.findCityidByCityName("韩国");
		PlacesParam placesParam = new PlacesParam();
		placesParam.setCityid(cityid);
		placesParam.setSort("1");
		List<PlacesDes> placesList = PlacesInfo.getPlacesInfo(placesParam, null, PlacesDes.class);
		placesService.addPlaces(placesList);
	}
	
}


