package com.lt.journey.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lt.journey.model.Journey;

@Repository
public interface GeoPointDao {
	public void addGeoPoint(List<Journey> journeyList);
}
