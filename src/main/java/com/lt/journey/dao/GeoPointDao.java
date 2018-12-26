package com.lt.journey.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lt.journey.model.JourneyDes;

@Repository
public interface GeoPointDao {
	public void addGeoPoint(List<JourneyDes> journeyList);
}
