package com.lt.journey.service;

import java.util.List;

import com.lt.journey.model.Places;
import com.lt.journey.model.PlacesDes;

public interface PlacesService {

	public void addPlaces(List<? extends Object> placesList);

	String findCityidByCityName(String cityName);

	public List<Places> findPlacesRecommend(String recommend, int offset, int pageSize);

	public int findCount(String recommend);

	public String findCityidByCityName_hotel(String string);

	public PlacesDes findPlaces(String id);

}
