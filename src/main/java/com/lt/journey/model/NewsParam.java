package com.lt.journey.model;

import lombok.Data;

@Data
public class NewsParam {
	private String size="10";			//每页条数
	private String sourceType="新闻网站";	//网站分类-新闻网站
	private String catLabel2;			//文章分类-旅游
	private String publishDateRange;	//
	private String createDateRange;		//
	private String pageToken_news;		//翻页值
}