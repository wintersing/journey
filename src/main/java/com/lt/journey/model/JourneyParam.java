package com.lt.journey.model;

import lombok.Data;

@Data
public class JourneyParam {
	private String cityid;
	private String id;
	private String kw;
	private String pageToken;
	private String sort;		//(人气最高：1，距离最近：2)
	private String lon;
	private String lat;	
}
