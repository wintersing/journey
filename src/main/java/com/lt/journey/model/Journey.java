package com.lt.journey.model;

import java.util.Arrays;

public class Journey {
	private String location;
	private String rating;
	private GeoPoint geoPoint;
	private String tags;
	private String telephones;
	private Integer rank;
	private String id;
	private String url;
	private String level;
	private String country;
	private String title;
	private String district;
	private String subtitle;
	private String city;
	private String[] imageUrls;
	private String tipInfo;
	private String openingHours;
	private String description;
	private Double price;
	private Integer commentCount;
	private KeyValues[] keyValues;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public GeoPoint getGeoPoint() {
		return geoPoint;
	}
	public void setGeoPoint(GeoPoint geoPoint) {
		this.geoPoint = geoPoint;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getTelephones() {
		return telephones;
	}
	public void setTelephones(String telephones) {
		this.telephones = telephones;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String[] getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(String[] imageUrls) {
		this.imageUrls = imageUrls;
	}
	public String getTipInfo() {
		return tipInfo;
	}
	public void setTipInfo(String tipInfo) {
		this.tipInfo = tipInfo;
	}
	public String getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	public KeyValues[] getKeyValues() {
		return keyValues;
	}
	public void setKeyValues(KeyValues[] keyValues) {
		this.keyValues = keyValues;
	}
	@Override
	public String toString() {
		return "Journey [location=" + location + ", rating=" + rating + ", geoPoint=" + geoPoint + ", tags=" + tags
				+ ", telephones=" + telephones + ", rank=" + rank + ", id=" + id + ", url=" + url + ", level=" + level
				+ ", country=" + country + ", title=" + title + ", district=" + district + ", subtitle=" + subtitle
				+ ", city=" + city + ", imageUrls=" + Arrays.toString(imageUrls) + ", tipInfo=" + tipInfo
				+ ", openingHours=" + openingHours + ", description=" + description + ", price=" + price
				+ ", commentCount=" + commentCount + ", keyValues=" + Arrays.toString(keyValues) + "]";
	}
}
