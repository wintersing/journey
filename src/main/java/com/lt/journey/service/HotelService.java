package com.lt.journey.service;

import java.util.List;

import com.lt.journey.model.Hotel;
import com.lt.journey.model.HotelDes;

public interface HotelService {

	public void addHotel(List<HotelDes> hotelList);

	public List<Hotel> findHotelRecommend();

}
