package com.lt.journey.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lt.journey.model.Blog;
import com.lt.journey.model.BlogDes;

@Repository
public interface BlogDao {

	public void addBlog(List<BlogDes> blogList);
	
	@Select("select * from blog where recommend = #{recommend} ORDER BY updatetime DESC limit #{offset}, #{pageSize}")
	public List<Blog> findBlog(@Param("recommend")String recommend, @Param("offset")int offset, @Param("pageSize")int pageSize);

	@Select("select count(*) from blog where recommend = 2")
	public int findBlogCount();
	
	@Select("select * from blog where id = #{id}")
	public BlogDes findBlogDes(@Param("id")String id);

}
