package com.lt.journey.model;

import java.util.Arrays;

public class TravelNotes {
	private Integer publishDate;
	private String content;
	private Integer commentCount;
	private String id;
	private String imageUrls;
	private Integer likeCount;
	private String shareCount;
	private Integer posterIdGrade;
	private KeyValues[] keyValues;
	private String url;
	private String avatarUrl;
	private Integer viewCount;
	private Integer updateDate;
	private Integer favoriteCount;
	private String city;
	private String posterId;
	private String publishDateStr;
	private String posterScreenName;
	public Integer getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Integer publishDate) {
		this.publishDate = publishDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	public String getShareCount() {
		return shareCount;
	}
	public void setShareCount(String shareCount) {
		this.shareCount = shareCount;
	}
	public Integer getPosterIdGrade() {
		return posterIdGrade;
	}
	public void setPosterIdGrade(Integer posterIdGrade) {
		this.posterIdGrade = posterIdGrade;
	}
	public KeyValues[] getKeyValues() {
		return keyValues;
	}
	public void setKeyValues(KeyValues[] keyValues) {
		this.keyValues = keyValues;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public Integer getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Integer updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getFavoriteCount() {
		return favoriteCount;
	}
	public void setFavoriteCount(Integer favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPosterId() {
		return posterId;
	}
	public void setPosterId(String posterId) {
		this.posterId = posterId;
	}
	public String getPublishDateStr() {
		return publishDateStr;
	}
	public void setPublishDateStr(String publishDateStr) {
		this.publishDateStr = publishDateStr;
	}
	public String getPosterScreenName() {
		return posterScreenName;
	}
	public void setPosterScreenName(String posterScreenName) {
		this.posterScreenName = posterScreenName;
	}
	@Override
	public String toString() {
		return "TravelNotes [publishDate=" + publishDate + ", content=" + content + ", commentCount=" + commentCount
				+ ", id=" + id + ", imageUrls=" + imageUrls + ", likeCount=" + likeCount + ", shareCount=" + shareCount
				+ ", posterIdGrade=" + posterIdGrade + ", keyValues=" + Arrays.toString(keyValues) + ", url=" + url
				+ ", avatarUrl=" + avatarUrl + ", viewCount=" + viewCount + ", updateDate=" + updateDate
				+ ", favoriteCount=" + favoriteCount + ", city=" + city + ", posterId=" + posterId + ", publishDateStr="
				+ publishDateStr + ", posterScreenName=" + posterScreenName + "]";
	}
}
