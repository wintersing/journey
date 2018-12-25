package com.lt.journey.model;

import lombok.Data;

@Data
public class Hotel {
	private String catName1;
	private String titleAliases;
	private ExternalIds[] externalIds;
	private String businessDistrict;
	private String infrastructures;
	private String brandId;
	private String id;
	private String facilities;
	private GeoPoint geoPoint;
	private String openDate;
	private Integer unifiedId;
	private String appCode;
	private String openingHours;
	private String commentCount;
	private String rating;
	private String[] tags;
	private String decorationDate;
	private DoodTagDist[] goodTagDist;
	private Integer roomCount;
	private String city;
	private String description;
	private Double price;
	private String level;
	private String catId1;
	private Integer minPrice;
	private String[] telephones;
	private String url;
	private String[] assistServices;
	private String district;
	private String brandName;
	private String address;
	private Integer hasWifi;
	private String title;
	private String[] imageUrls;
	private String catPathKey;
	private Integer favoriteCount;
	private String discountInfo;
	private Integer floorCount;
	private Double lowPrice;
}
