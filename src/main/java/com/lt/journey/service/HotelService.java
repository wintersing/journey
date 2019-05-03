package com.lt.journey.service;

import java.util.List;

import com.lt.journey.model.Hotel;
import com.lt.journey.model.HotelDes;

public interface HotelService {

	public void addHotel(List<? extends Object> hotelList);

	public List<Hotel> findHotelRecommend(String recommend, int offset, int pageSize);

	public int findHotelCount();

	public String findCityidByCityName(String cityName);

	public HotelDes findHotel(String id);


}
