package com.lt.journey.model;

import lombok.Data;

@Data
public class HotelDes {
	private String businessDistrict;	//商圈
	private String brandId;				//品牌id
	private String id;					//酒店id
	private GeoPoint geoPoint;
	private String openingHours;
	private String commentCount;
	private String rating;
	private String[] tags;
	private String[] facilities;		//屋内设施
	private String[] infrastructures;	//酒店设施
	private String[] goodTagDist;	//正面标签分布
	private String[] assistServices;	//服务
	private String city;
	private String description;
	private String price;
	private String level;
	private String minPrice;
	private String[] telephones;
	private String url;
	private String district;			//地区
	private String brandName;			//品牌名称
	private String address;
	private Integer hasWifi;
	private String title;
	private String[] imageUrls;
//	private String catPathKey;
//	private Integer favoriteCount;
//	private String openDate;			//开业时间
//	private String discountInfo;
//	private Integer roomCount;			//客房数
//	private Integer floorCount;
//	private Double lowPrice;
//	private String catId1;
//	private String decorationDate;
//	private Integer unifiedId;
//	private String appCode;			
//	private String catName1;
//	private String titleAliases;
//	private ExternalIds[] externalIds;
}
