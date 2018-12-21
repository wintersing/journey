package com.lt.journey.model;

public class HotelParam {
	private String lon;
	private String lat;
	private String distance;
	private String kw;
	private String pageToken;
	private String city;
	private String level;
	private String brandName;
	private String address;
	private String businessDistrict;
	private String sortByField;
	private String appCode;
	
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
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBusinessDistrict() {
		return businessDistrict;
	}
	public void setBusinessDistrict(String businessDistrict) {
		this.businessDistrict = businessDistrict;
	}
	public String getSortByField() {
		return sortByField;
	}
	public void setSortByField(String sortByField) {
		this.sortByField = sortByField;
	}
	public String getAppCode() {
		return appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	@Override
	public String toString() {
		return "HotelParam [lon=" + lon + ", lat=" + lat + ", distance=" + distance + ", kw=" + kw + ", pageToken="
				+ pageToken + ", city=" + city + ", level=" + level + ", brandName=" + brandName + ", address="
				+ address + ", businessDistrict=" + businessDistrict + ", sortByField=" + sortByField + ", appCode="
				+ appCode + "]";
	}
	
}
