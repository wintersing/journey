package com.lt.commons.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import com.lt.journey.exception.MessageException;
import com.lt.journey.model.BlogDes;
import com.lt.journey.model.BlogParam;
import com.lt.journey.service.BlogService;
import com.lt.journey.util.BlogInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-*.xml","classpath*:mybatis-config.xml" })
public class BlogTest {

	private static final Model model = null;

	@Autowired
	private BlogService blogService;
	
	@Test
	public void name() throws MessageException {
		BlogParam blogParam = new BlogParam();
//		blogParam.setId("100041");
		blogParam.setCityid("26");//1,1005,1096,360,26
		blogParam.setSort("0");
		blogParam.setPageToken("0");
//		List<Blog> blogList = BlogInfo.getBlogInfo(blogParam, model, Blog.class);
		List<BlogDes> blogDesList = BlogInfo.getBlogInfo(blogParam, model, BlogDes.class);
//		BlogDes blogList = BlogInfo.getBlogDesInfo(blogParam);
//		System.out.println(blogDesList);
		blogService.addBlog(blogDesList);
	}
	
}
