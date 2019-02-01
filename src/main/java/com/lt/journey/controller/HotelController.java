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
import com.lt.journey.model.ResObj;
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
		ResObj resObj =  new ResObj();
		int page = 1;
		if (pageToken != null && pageToken != "") {
			page = Integer.parseInt(pageToken);
		} 
		List<Hotel> hotelList = hotelService.findHotelRecommend("2", (page-1)*pageSize, pageSize);
		int count = hotelService.findHotelCount();
		if (count > pageSize * page) {
			resObj.setHasNext("1");
		} else {
			resObj.setHasNext("0");
		}
		resObj.setDataList(hotelList);
		resObj.setPageToken(page + "");
		resObj.setReqURI(req.getRequestURI());
		model.addAttribute(resObj);
		return "hotel";
	}
	
	@RequestMapping("/hotel/search")
	public String searchHotel(Model model, HotelParam hotelParam) throws UnsupportedEncodingException {
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
		
		ResObj resObj = HotelInfo.getHotelInfo(hotelParam);
		model.addAttribute(resObj);
		return "hotel";
	}

	@RequestMapping("/hotel/{id}")
	public String hotelSingle(@PathVariable("id") String id, String recommend, Model model) {
		if (recommend == null) {
			HotelParam hotelParam = new HotelParam();
			hotelParam.setId(id);
			ResObj resObj = HotelInfo.getHotelInfo(hotelParam);
			model.addAttribute(resObj);
		} else {
			HotelDes hotelDes = hotelService.findHotel(id);
			model.addAttribute(hotelDes);
		}
		return "hotel-single";
	}
}
