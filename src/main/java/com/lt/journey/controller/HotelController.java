package com.lt.journey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HotelController {

	@RequestMapping("/hotelView")
	public String hotelView() {
		return "hotel";
	}

	@RequestMapping("/hotelSingleView")
	public String hotelSingleView() {
		return "hotel-single";
	}
}
