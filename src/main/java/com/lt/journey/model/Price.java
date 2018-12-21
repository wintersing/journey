package com.lt.journey.model;

import java.util.ArrayList;

public class Price {
	private Integer leftNumber;
	private String seatStatus;
	private Integer seat;
	private Double price;
	private Double stuPrice;
	private Double promotionPrice;
	private Integer resId;
	private ArrayList<Detail> detail;
	private String priceMemo;
	private String seatName;
	public Integer getLeftNumber() {
		return leftNumber;
	}
	public void setLeftNumber(Integer leftNumber) {
		this.leftNumber = leftNumber;
	}
	public String getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}
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
	public Double getStuPrice() {
		return stuPrice;
	}
	public void setStuPrice(Double stuPrice) {
		this.stuPrice = stuPrice;
	}
	public Double getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(Double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public Integer getResId() {
		return resId;
	}
	public void setResId(Integer resId) {
		this.resId = resId;
	}
	public ArrayList<Detail> getDetail() {
		return detail;
	}
	public void setDetail(ArrayList<Detail> detail) {
		this.detail = detail;
	}
	public String getPriceMemo() {
		return priceMemo;
	}
	public void setPriceMemo(String priceMemo) {
		this.priceMemo = priceMemo;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	@Override
	public String toString() {
		return "price [leftNumber=" + leftNumber + ", seatStatus=" + seatStatus + ", seat=" + seat + ", price=" + price
				+ ", stuPrice=" + stuPrice + ", promotionPrice=" + promotionPrice + ", resId=" + resId + ", detail="
				+ detail + ", priceMemo=" + priceMemo + ", seatName=" + seatName + "]";
	}
}
