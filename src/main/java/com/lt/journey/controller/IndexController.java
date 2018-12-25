package com.lt.journey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping("/")
	public String indexView() {
		
		return "index";
	}
	
}
