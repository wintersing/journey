package com.lt.journey.model;

import lombok.Data;

@Data
public class News {
	private String uniquekey;
	private String title;
	private String date;
	private String category;
	private String author_name;
	private String url;
	private String thumbnail_pic_s;
	private String thumbnail_pic_s02;
	private String thumbnail_pic_s03;
}
