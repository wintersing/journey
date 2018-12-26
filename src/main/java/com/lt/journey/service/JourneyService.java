package com.lt.journey.service;

import java.util.List;

import com.lt.journey.model.Journey;
import com.lt.journey.model.JourneyDes;

public interface JourneyService {

	public void addJourney(List<JourneyDes> journeyList);

	String findCityidByCityName(String cityName);

	public List<Journey> findJourneyRecommend();

}
