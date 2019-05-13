package com.lt.journey.model;

import lombok.Data;

@Data
public class Comment {
	private int id;
	private String parent;
	private String parentID;
	private String avatarUrl;
	private String commenterScreenName;
	private long publishDate;
	private String content;
}
