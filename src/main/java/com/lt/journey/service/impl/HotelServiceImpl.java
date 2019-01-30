package com.lt.journey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.GeoPointDao;
import com.lt.journey.dao.HotelDao;
import com.lt.journey.model.HotelDes;
import com.lt.journey.model.Hotel;
import com.lt.journey.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelDao hotelDao;
	
	@Autowired
	private GeoPointDao geoPointDao;

	@Override
	public void addHotel(List<HotelDes> hotelList) {
		// TODO Auto-generated method stub
		List hotelList_ = hotelList;
		List<Object> hotelObjList = hotelList_;
		geoPointDao.addGeoPoint(hotelObjList);
		hotelDao.addHotel(hotelList);
	}

	@Override
	public List<Hotel> findHotelRecommend(String recommend, int offset, int pageSize) {
		// TODO Auto-generated method stub
		return hotelDao.findHotelRecommend(recommend, offset, pageSize);
	}

	@Override
	public int findHotelCount() {
		// TODO Auto-generated method stub
		return hotelDao.findHotelCount();
	}

	@Override
	public String findCityidByCityName(String cityName) {
		// TODO Auto-generated method stub
		return hotelDao.findCityidByCityName(cityName);
	}

}
