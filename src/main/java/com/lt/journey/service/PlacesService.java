package com.lt.journey.service;

import java.util.List;

import com.lt.journey.model.Places;
import com.lt.journey.model.PlacesDes;

public interface PlacesService {

	public void addPlaces(List<PlacesDes> placesList);

	String findCityidByCityName(String cityName);

	public List<Places> findPlacesRecommend(String recommend);

}
