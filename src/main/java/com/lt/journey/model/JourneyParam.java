package com.lt.journey.model;

public class JourneyParam {
	private String cityid;
	private String id;
	private String kw;
	private String pageToken;
	private String sort;//(人气最高：1，距离最近：2)
	private String lon;
	private String lat;
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKw() {
		return kw;
	}
	public void setKw(String kw) {
		this.kw = kw;
	}
	public String getPageToken() {
		return pageToken;
	}
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "JourneyParam [cityid=" + cityid + ", id=" + id + ", kw=" + kw + ", pageToken=" + pageToken + ", sort="
				+ sort + ", lon=" + lon + ", lat=" + lat + "]";
	}
	
}
