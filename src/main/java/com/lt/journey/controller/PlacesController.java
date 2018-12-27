package com.lt.journey.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	
	@RequestMapping("/placesView")
	public String placesView(Model model, String cityid, String cityName, String sort, String pageToken) {
		List<Places> placesList = placesService.findPlacesRecommend("2");
		ResObj resObj =  new ResObj();
		resObj.setDataList(placesList);
		resObj.setHasNext("0");
		resObj.setPageToken("2");
		resObj.setSort("1");
		model.addAttribute(resObj);
		return "places";
	}

	@RequestMapping("/searchPlaces")
	public String searchPlaces(Model model, String cityid, String cityName, String sort, String pageToken) throws UnsupportedEncodingException {
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
		model.addAttribute(resObj);
		return "places";
	}
}


