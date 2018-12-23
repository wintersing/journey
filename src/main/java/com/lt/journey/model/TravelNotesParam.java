package com.lt.journey.model;

public class TravelNotesParam {
	private String pageToken;
	private String cityid;
	private String sort;
	private String DaysMin;
	private String DaysMax;
	private String Month;
	private String company;
	private String recommend;
	private String kw;
	public String getPageToken() {
		return pageToken;
	}
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getDaysMin() {
		return DaysMin;
	}
	public void setDaysMin(String daysMin) {
		DaysMin = daysMin;
	}
	public String getDaysMax() {
		return DaysMax;
	}
	public void setDaysMax(String daysMax) {
		DaysMax = daysMax;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public String getKw() {
		return kw;
	}
	public void setKw(String kw) {
		this.kw = kw;
	}
	@Override
	public String toString() {
		return "TravelNotesParam [pageToken=" + pageToken + ", cityid=" + cityid + ", sort=" + sort + ", DaysMin="
				+ DaysMin + ", DaysMax=" + DaysMax + ", Month=" + Month + ", company=" + company + ", recommend="
				+ recommend + ", kw=" + kw + "]";
	}
}
