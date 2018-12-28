package com.lt.journey.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.journey.model.Places;
import com.lt.journey.model.PlacesDes;
import com.lt.journey.model.PlacesParam;
import com.lt.journey.model.ResObj;
import com.lt.journey.service.PlacesService;
import com.lt.journey.util.PlacesInfo;

@Controller
@RequestMapping("/")
public class PlacesController {
	@Autowired
	private PlacesService placesService;
	
	private final int pageSize = 8;
	
	@RequestMapping("/placesView")
	public String placesView(Model model, String pageToken,HttpServletRequest req) {
		ResObj resObj =  new ResObj();
		int page = 1;
		if (pageToken != null && pageToken != "") {
			page = Integer.parseInt(pageToken);
		} 
		List<Places> placesList = placesService.findPlacesRecommend("2", (page-1)*pageSize, pageSize);
		resObj.setDataList(placesList);
		int count = placesService.findCount("2"); 
		if (count > pageSize * page) {
			resObj.setHasNext("1");
		} else {
			resObj.setHasNext("0");
		}
		resObj.setPageToken(page + 1 + "");
		resObj.setReqURI(req.getRequestURI());
		model.addAttribute(resObj);
		return "places";
	}

	@RequestMapping("/searchPlaces")
	public String searchPlaces(Model model, String cityid, String cityName, String sort, String pageToken,HttpServletRequest req)
			throws UnsupportedEncodingException {
		if (cityid == null) {
			cityName = new String(cityName.getBytes("ISO-8859-1"), "utf-8");
			cityid = placesService.findCityidByCityName(cityName);
		}
		PlacesParam placesParam = new PlacesParam();
		placesParam.setCityid(cityid);
		placesParam.setSort(sort);
		placesParam.setPageToken(pageToken);
		ResObj resObj = PlacesInfo.getPlacesInfo(placesParam);
		resObj.setSort(sort);
		resObj.setCityid(cityid);
		resObj.setReqURI(req.getRequestURI());
		model.addAttribute(resObj);
		return "places";
	}
}


