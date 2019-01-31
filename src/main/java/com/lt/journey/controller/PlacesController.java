package com.lt.journey.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

	private final int pageSize = 9;

	@RequestMapping("/places")
	public String placesView(Model model, String pageToken, HttpServletRequest req) {
		ResObj resObj = new ResObj();
		int page = 1;
		if (pageToken != null && pageToken != "") {
			page = Integer.parseInt(pageToken);
		}
		List<Places> placesList = placesService.findPlacesRecommend("2", (page - 1) * pageSize, pageSize);
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

	@RequestMapping("/places/search")
	public String searchPlaces(Model model, String cityid, String cityName, String sort, String pageToken,
			HttpServletRequest req) throws UnsupportedEncodingException {
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

	@RequestMapping("/places/{id}")
	public String placesSingle(@PathVariable("id") String id, Integer recommend, Model model) {
		if (recommend == 1 || recommend == 2) {
			PlacesDes placesDes = placesService.findPlaces(id);
			model.addAttribute(placesDes);
		} else {
			PlacesParam placesParam = new PlacesParam();
			placesParam.setId(id);
			ResObj resObj = PlacesInfo.getPlacesInfo(placesParam);
			model.addAttribute(resObj);
		}
		return "places-single";
	}

}
