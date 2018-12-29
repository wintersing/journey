package com.lt.journey.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainDao {
	
	@Select("select trainCityCode from train_city where cityName = #{cityName}")
	public String findCityCode(@Param("cityName")String cityName);
}
