package com.lt.journey.model;

import java.util.ArrayList;

import lombok.Data;

@Data
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
}
