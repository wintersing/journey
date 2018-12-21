package com.lt.journey.model;

public class TrainParam {
	private String departureDate; 
	private String departureCityCode; 
	private String departureCityName; 
	private String arrivalCityCode; 
	private String arrivalCityName; 
	private String start;  
	private String limit;
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureCityCode() {
		return departureCityCode;
	}
	public void setDepartureCityCode(String departureCityCode) {
		this.departureCityCode = departureCityCode;
	}
	public String getDepartureCityName() {
		return departureCityName;
	}
	public void setDepartureCityName(String departureCityName) {
		this.departureCityName = departureCityName;
	}
	public String getArrivalCityCode() {
		return arrivalCityCode;
	}
	public void setArrivalCityCode(String arrivalCityCode) {
		this.arrivalCityCode = arrivalCityCode;
	}
	public String getArrivalCityName() {
		return arrivalCityName;
	}
	public void setArrivalCityName(String arrivalCityName) {
		this.arrivalCityName = arrivalCityName;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "TrainParam [departureDate=" + departureDate + ", departureCityCode=" + departureCityCode
				+ ", departureCityName=" + departureCityName + ", arrivalCityCode=" + arrivalCityCode
				+ ", arrivalCityName=" + arrivalCityName + ", start=" + start + ", limit=" + limit + "]";
	} 
	
}
