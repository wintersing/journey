package com.lt.journey.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.journey.model.Journey;
import com.lt.journey.service.JourneyService;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private JourneyService journeyService;

	@RequestMapping("/")
	public String indexView(Model model) {
		List<Journey> journeyList = journeyService.findJourneyRecommend();
		model.addAttribute(journeyList);
		return "index";
	}
	
	@Test
	public void name() {
		System.out.println(4.5%1.0);
	}
	
}
