package com.lt.journey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BlogController {
	
	@RequestMapping("/blogView")
	public String blogView() {
		return "blog";
	}	
	
	@RequestMapping("/blogSingleView")
	public String blogSingleView() {
		return "blog-single";
	}
}
