package com.lt.journey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.journey.model.Hotel;
import com.lt.journey.model.Places;
import com.lt.journey.service.HotelService;
import com.lt.journey.service.PlacesService;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private PlacesService placesService;
	
	@Autowired
	private HotelService hotelService;
	
	@RequestMapping("/")
	public String indexView(Model model) {
		List<Places> placesList = placesService.findPlacesRecommend();
		List<Hotel> hotelList = hotelService.findHotelRecommend();
		model.addAttribute(placesList);
		model.addAttribute(hotelList);
		return "index";
	}
	
}
