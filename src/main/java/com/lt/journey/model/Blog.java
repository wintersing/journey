package com.lt.journey.model;

import lombok.Data;

@Data
public class Blog {
	private String id;
	private String cityid;
	private String publishDate;
	private String avatarUrl;
	private String likeCount;
	private String commentCount;
	private String viewCount;
	private String favoriteCount;
	private String city;
	private String title;
	private String posterId;
	private String publishDateStr;
	private String posterScreenName;
	private String recommend = "0";//1-主页推荐,2-景点推荐
}
