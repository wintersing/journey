package com.lt.journey.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.commons.utils.CommonsUtils;
import com.lt.journey.model.Train;
import com.lt.journey.model.TrainParam;
import com.lt.journey.service.TrainService;
import com.lt.journey.util.TrainInfo;

@Controller
@RequestMapping("/")
public class TrainController {

	@Autowired
	private TrainService trainService;

	@RequestMapping("/train")
	public String trainView() {
		return "train";
	}

	@RequestMapping("/train/search")
	public String searchTrain(Model model, TrainParam trainParam) throws UnsupportedEncodingException, ParseException {

		trainParam.setDepartureCityName(new String(trainParam.getDepartureCityName().getBytes("ISO-8859-1"), "utf-8"));
		trainParam.setArrivalCityName(new String(trainParam.getArrivalCityName().getBytes("ISO-8859-1"), "utf-8"));

		if (trainParam.getLimit() == 0) {
			String departureCityCode = trainService.findCityCode(trainParam.getDepartureCityName());
			String arrivalCityCode = trainService.findCityCode(trainParam.getArrivalCityName());
			trainParam.setDepartureCityCode(departureCityCode);
			trainParam.setArrivalCityCode(arrivalCityCode);
			// 处理时间格式
			String time = CommonsUtils.format(trainParam.getDepartureDate());
			if (time.compareTo(new SimpleDateFormat("yyyy-MM-dd").format(new Date())) == -1) {
				model.addAttribute("timeError", true);
				return "train";
			}
			trainParam.setDepartureDate(time);
		}
		// 起始值
		Integer page = trainParam.getPage();
		trainParam.setStart((page-1) * trainParam.getLimit());

		// 得到火车余票信息
		List<Train> trainList = TrainInfo.getTrainInfo(trainParam, model);

		if (trainList == null) return "msg";

		return "train";
	}
	
	@Test
	public void name() {
		String s1 = "2019-05-14"; 
		String s2 = "2019-05-13"; 
		System.out.println( s1.compareTo(s2) ); // -1 (前面相等,s1长度小1) 
	}

}
