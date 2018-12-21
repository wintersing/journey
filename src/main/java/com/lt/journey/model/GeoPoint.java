package com.lt.journey.model;

public class GeoPoint {
	private Double lon;
	private Double lat;
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "GeoPoint [lon=" + lon + ", lat=" + lat + "]";
	}
}
