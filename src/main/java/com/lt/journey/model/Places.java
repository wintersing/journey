package com.lt.journey.model;

import lombok.Data;

@Data
public class Places {
	private String[] imageUrls;		
	private String location;
	private Double rating;
	private String id;
	private String city;
	private String country;
	private String title;
	private String subtitle;
	private Double price;
	private String openingHours;
}
