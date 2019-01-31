package com.lt.journey.model;

import lombok.Data;

@Data
public class PlacesDes {
	private String location;
	private Double rating;
	private String rank;			//综合排名
	private String id;
	private String url;
	private String country;
	private String city;
	private String title;
	private String subtitle;
	private String[] imageUrls;		
	private String tipInfo;			//提示信息
	private String openingHours;
	private String description;
	private String price;
	private Integer commentCount;
	private GeoPoint geoPoint;
	private String[] keyValues;		
	private String recommend = "0";		//是否推荐(1-推荐，0-不推荐)
//	private String telephones;
//	private String district;
//	private String level;
//	private String tags;
}
