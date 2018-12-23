package com.lt.journey.model;

public class ExternalIds {
	private String appCode;
	private String id;
	public String getAppCode() {
		return appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ExternalIds [appCode=" + appCode + ", id=" + id + "]";
	}
}
