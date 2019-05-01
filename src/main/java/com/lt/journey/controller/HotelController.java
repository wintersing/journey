package com.lt.journey.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.journey.model.Hotel;
import com.lt.journey.model.HotelDes;
import com.lt.journey.model.HotelParam;
import com.lt.journey.service.HotelService;
import com.lt.journey.util.HotelInfo;

@Controller
@RequestMapping("/")
public class HotelController {

	private final int pageSize = 9;

	@Autowired
	private HotelService hotelService;
 
	@RequestMapping("/hotel")
	public String hotelView(Model model, String pageToken,HttpServletRequest req) {

		if (pageToken == null || pageToken == "") {
			pageToken = "1";
		} 
		List<Hotel> hotelList = hotelService.findHotelRecommend("2", (Integer.parseInt(pageToken)-1)*pageSize, pageSize);
		int count = hotelService.findHotelCount();
		
		model.addAttribute(hotelList);
		model.addAttribute("pageToken", pageToken);
		if (count > pageSize * Integer.parseInt(pageToken)) {
			model.addAttribute("hasNext", "1");
		} else {
			model.addAttribute("hasNext", "0");
		}

		model.addAttribute("reqURI", req.getRequestURI());
		
		return "hotel";
	}
	
	@RequestMapping("/hotel/search")
	public String searchHotel(Model model, HotelParam hotelParam, HttpServletRequest req) throws UnsupportedEncodingException {
		String city = hotelParam.getCity();
		if (city != null && city != "") {
			hotelParam.setCity(new String(city.getBytes("ISO-8859-1"), "utf-8"));		
		}
		String level = hotelParam.getLevel();
		if (level != null && level != "") {
			hotelParam.setLevel(new String(level.getBytes("ISO-8859-1"), "utf-8"));		
		}
		String brandName = hotelParam.getBrandName();
		if (brandName != null && brandName != "") {
			hotelParam.setBrandName(new String(brandName.getBytes("ISO-8859-1"), "utf-8"));		
		}
		
		//请求“酒店信息API”，并将返回结果放入model
		HotelInfo.getHotelInfo(hotelParam, model, Hotel.class); 
		model.addAttribute("reqURI", req.getRequestURI());
		return "hotel";
	}

	@RequestMapping("/hotel/{id}")
	public String hotelSingle(@PathVariable("id") String id, String recommend, Model model) {
		if (recommend == null) {
			HotelParam hotelParam = new HotelParam();
			hotelParam.setId(id);
			HotelDes hotelDes = HotelInfo.getHotelDesInfo(hotelParam);
			model.addAttribute(hotelDes);
		} else {
			HotelDes hotelDes = hotelService.findHotel(id);
			model.addAttribute(hotelDes);
		}
		return "hotel-single";
	}
}
