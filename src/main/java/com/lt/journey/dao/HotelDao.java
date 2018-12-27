package com.lt.journey.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lt.journey.model.Hotel;
import com.lt.journey.model.HotelDes;

@Repository
public interface HotelDao {

	public void addHotel(List<HotelDes> hotelList);

	@Select("select * from hotel where recommend = 1")
	public List<Hotel> findHotelRecommend();

}
