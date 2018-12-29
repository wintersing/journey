package com.lt.journey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.TrainDao;
import com.lt.journey.service.TrainService;

@Service("trainService")
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainDao trainDao;

	@Override
	public String findCityCode(String cityName) {
		// TODO Auto-generated method stub
		return trainDao.findCityCode(cityName);
	}

}
