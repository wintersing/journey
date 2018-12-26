package com.lt.journey.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lt.journey.model.Journey;
import com.lt.journey.model.JourneyDes;

@Repository
public interface JourneyDao {
	public void addJourney(List<JourneyDes> journeyList);
	
	@Select("select cityid from journey_city where cityName = #{cityName}")
	public String findCityidByCityName(@Param("cityName")String cityName);

	@Select("select * from journey where recommend = 1")
	public List<Journey> findJourneyRecommend();
}
