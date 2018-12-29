package com.lt.commons.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lt.journey.model.HotelDes;
import com.lt.journey.model.HotelParam;
import com.lt.journey.service.HotelService;
import com.lt.journey.util.HotelInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-*.xml","classpath*:mybatis-config.xml" })
public class HotelTest {
	
	@Autowired
	private HotelService hotelService;
	
	@Test
	public void name() {
		HotelParam hotelParam = new HotelParam();
		hotelParam.setCity("北京");
		hotelParam.setLevel("五星级/豪华");
		hotelParam.setPageToken("1");
		List<HotelDes> hotelList = HotelInfo.getHotelInfo(hotelParam);
		hotelService.addHotel(hotelList);
	}
}
