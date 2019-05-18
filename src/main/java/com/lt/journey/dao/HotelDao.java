package com.lt.journey.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lt.journey.model.Hotel;
import com.lt.journey.model.HotelDes;

@Repository
public interface HotelDao {

	public void addHotel(List<? extends Object> hotelList);
	
	@Select("select * from hotel where recommend = #{recommend} ORDER BY updatetime DESC limit #{offset}, #{pageSize}")
	public List<Hotel> findHotelRecommend(@Param("recommend")String recommend, @Param("offset")int offset, @Param("pageSize")int pageSize);

	public List<Hotel> findHotelDes(@Param("id")String id);

	@Select("select count(*) from hotel where recommend = 2")
	public int findHotelCount();

//	@Select("select cityid from hotel_city where cityName = #{cityName }")
//	public String findCityidByCityName(@Param("cityName")String cityName);

	@Select("select * from hotel where id = #{id }")
	public HotelDes findHotel(@Param("id")String id);

}
