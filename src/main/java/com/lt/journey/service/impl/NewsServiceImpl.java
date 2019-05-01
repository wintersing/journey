package com.lt.journey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.NewsDao;
import com.lt.journey.model.News;
import com.lt.journey.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsDao newsDao;

	@Override
	public void addNews(List<News> newsList) {
		// TODO Auto-generated method stub
		newsDao.addNews(newsList);
	}

	@Override
	public List<News> findNewsRecommend(String recommend, int i, int pageSize) {
		// TODO Auto-generated method stub
		return newsDao.findNewsRecommend(recommend, i, pageSize);
	}

}
