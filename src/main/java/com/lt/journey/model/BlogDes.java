package com.lt.journey.model;

import lombok.Data;

@Data
public class BlogDes {
	private String content;
	private String publishDate;
	private String commentCount;
	private String id;
	private String cityid;
	private String imageUrls;
	private String likeCount;
//	private String url;
	private String avatarUrl;
	private String viewCount;
	private String favoriteCount;
	private String city;
	private String title;
	private String posterId;
	private String publishDateStr;
	private String posterScreenName;;
	private String recommend = "0";
}
