package com.lt.journey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.BlogDao;
import com.lt.journey.model.Blog;
import com.lt.journey.model.BlogDes;
import com.lt.journey.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	
	@Override
	public void addBlog(List<BlogDes> blogList) {
		// TODO Auto-generated method stub
		blogDao.addBlog(blogList);
	}

	@Override
	public List<Blog> findBlog(String recommend, int i, int pageSize) {
		// TODO Auto-generated method stub
		return blogDao.findBlog(recommend, i, pageSize);
	}

	@Override
	public int findBlogCount() {
		// TODO Auto-generated method stub
		return blogDao.findBlogCount();
	}

	@Override
	public BlogDes findBlogDes(String id) {
		// TODO Auto-generated method stub
		return blogDao.findBlogDes(id);
	}

}
