package com.lt.journey.service;

import java.util.List;

import com.lt.journey.model.Blog;
import com.lt.journey.model.BlogDes;

public interface BlogService {

	public void addBlog(List<BlogDes> blogDesList);

	public List<Blog> findBlog(String recommend, int i, int pageSize);

	public int findBlogCount();

	public BlogDes findBlogDes(String id);

}
