package com.lt.journey.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.GeoPointDao;
import com.lt.journey.dao.PlacesDao;
import com.lt.journey.model.Places;
import com.lt.journey.model.PlacesDes;
import com.lt.journey.service.PlacesService;


@Service("placesService")
public class PlacesServiceImpl implements PlacesService {
	
	@Autowired
	private GeoPointDao geoPointDao;

	@Autowired
	private PlacesDao placesDao;
	
	public void addPlaces(List<PlacesDes> placesList) {
		List placesList_ = placesList;
		List<Object> placesObjList = placesList_;
		geoPointDao.addGeoPoint(placesObjList);
		placesDao.addPlaces(placesList);
	}
	
	public String findCityidByCityName(String cityName) {
		String cityid = placesDao.findCityidByCityName(cityName);
		return cityid;
	}

	@Override
	public List<Places> findPlacesRecommend(String recommend, int offset, int pageSize) {
		return placesDao.findPlacesRecommend(recommend, offset, pageSize);
	}

	@Override
	public int findCount(String recommend) {
		// TODO Auto-generated method stub
		return placesDao.findCount(recommend);
	}

	@Override
	public String findCityidByCityName_hotel(String cityName) {
		// TODO Auto-generated method stub
		return placesDao.findCityidByCityName_hotel(cityName);
	}

	@Override
	public PlacesDes findPlaces(String id) {
		// TODO Auto-generated method stub
		return placesDao.findPlaces(id);
	}

}
