package com.lt.journey.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lt.journey.model.Journey;

@Repository
public interface JourneyDao {
	public void addJourney(List<Journey> journeyList);
	
	@Select("select cityid from journey_city where cityName = #{cityName}")
	public String findCityidByCityName(@Param("cityName")String cityName);
}
