package com.lt.commons.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lt.journey.model.JourneyDes;
import com.lt.journey.model.JourneyParam;
import com.lt.journey.service.JourneyService;
import com.lt.journey.util.JourneyInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-*.xml","classpath*:mybatis-config.xml" })
public class JourneyTest {
	@Autowired
	private JourneyService journeyService;


//	@Test
//	public void name() {
//		JSONObject dataObj = JSON.parseObject(dataStr);
//		String journeyListStr = dataObj.getJSONArray("data") + "";
//		List<Journey> journeyList = JSONObject.parseArray(journeyListStr, Journey.class);
//		journeyService.addJourney(journeyList);
////		System.out.println(journeyList);
//	}
	
	
	@Test
	public void name1() {
		String[] asd = {"123","456","789"};
		System.out.println(Arrays.toString(asd));
	}
	
	
	@Test
	public void name2() {
		String cityid = journeyService.findCityidByCityName("北京");
		JourneyParam journeyParam = new JourneyParam();
		journeyParam.setCityid(cityid);
		journeyParam.setSort("1");
		List<JourneyDes> journeyList = JourneyInfo.getJourneyInfo(journeyParam);
		journeyService.addJourney(journeyList);
	}
	
}


