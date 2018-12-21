package com.lt.journey.model;

public class Detail {
	private Integer seat;
	private Double price;
	private Double promotionPrice;
	private String seatName;
	public Integer getSeat() {
		return seat;
	}
	public void setSeat(Integer seat) {
		this.seat = seat;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(Double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	@Override
	public String toString() {
		return "Detail [seat=" + seat + ", price=" + price + ", promotionPrice=" + promotionPrice + ", seatName="
				+ seatName + "]";
	}
}
