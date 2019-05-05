package com.lt.journey.model;

import lombok.Data;

@Data
public class Comment {
	private String id;
	private String comment;
	private String publishDateStr;
	private String commenterScreenName;
	private User user;
}
