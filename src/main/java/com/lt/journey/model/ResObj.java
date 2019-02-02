package com.lt.journey.model;

import java.util.List;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Setter
@Getter
@ToString
public class ResObj {
	private List dataList;
	private Object data;
	private String hasNext;
	private String pageToken;
	private String retcode;//100-无结果，200-200，404-404，500-服务器错误
	private String msg;
	private String reqURI;
	private String param;
	private TrainParam trainParam;
	private HotelParam hotelParam;
	private PlacesParam placesParam;
}
