package com.lt.journey.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GeoPointDao {
	public void addGeoPoint(List<? extends Object> journeyList);
}
