package com.lt.journey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.GeoPointDao;
import com.lt.journey.dao.JourneyDao;
import com.lt.journey.model.Journey;
import com.lt.journey.service.JourneyService;

@Service("journeyService")
public class JourneyServiceImpl implements JourneyService {
	
	@Autowired
	private GeoPointDao geoPointDao;

	@Autowired
	private JourneyDao journeyDao;
	
	public void addJourney(List<Journey> journeyList) {
		geoPointDao.addGeoPoint(journeyList);
		journeyDao.addJourney(journeyList);
	}
	
	public String findCityidByCityName(String cityName) {
		String cityid = journeyDao.findCityidByCityName(cityName);
		return cityid;
	}

}
