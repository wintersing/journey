package com.lt.journey.model;

public class TrainParam {
	private String departureDate; 		//发车日期-
	private String departureCityCode; 	//出发站码
	private String departureCityName; 	//出发站名-
	private String arrivalCityCode; 	//到达站码
	private String arrivalCityName; 	//到达站名-
	private String start;  				//起始值
	private String limit;				//数量
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
