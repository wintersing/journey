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
	private String hasNext;
	private String pageToken;
	private String retcode;
	private String sort;
	private String cityName;
	private String cityid;
	private String reqURI;
}
