package com.lt.journey.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lt.journey.model.Places;
import com.lt.journey.model.PlacesDes;

@Repository
public interface PlacesDao {
	public void addPlaces(List<? extends Object> placesList);
	
	@Select("select cityid from places_city where cityName = #{cityName}")
	public String findCityidByCityName(@Param("cityName")String cityName);

	@Select("select * from places where recommend = #{recommend} ORDER BY updatetime DESC limit #{offset}, #{pageSize}")
	public List<Places> findPlacesRecommend(@Param("recommend")String recommend, @Param("offset")int offset, @Param("pageSize")int pageSize);

	@Select("select count(*) from places where recommend = #{recommend}")
	public int findCount(@Param("recommend")String recommend);

	@Select("select cityid from hotel_city where cityName = #{cityName}")
	public String findCityidByCityName_hotel(@Param("cityName")String cityName);

//	@Select("select * from places p, geopoint g where p.geoPointID = g.id AND p.id = #{id}")
	public PlacesDes findPlacesDes(@Param("id")String id);
}
