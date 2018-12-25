package com.lt.journey.service;

import java.util.List;

import com.lt.journey.model.Journey;

public interface JourneyService {

	public void addJourney(List<Journey> journeyList);

	String findCityidByCityName(String cityName);

}
