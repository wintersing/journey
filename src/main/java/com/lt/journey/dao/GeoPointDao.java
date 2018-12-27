package com.lt.journey.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lt.journey.model.HotelDes;
import com.lt.journey.model.PlacesDes;

@Repository
public interface GeoPointDao {
	public void addGeoPoint(List<Object> journeyList);
}
