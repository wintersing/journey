package com.lt.journey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ContactController {
	
	@RequestMapping("/contactView")
	public String contactView() {
		return "contact";
	}
}
