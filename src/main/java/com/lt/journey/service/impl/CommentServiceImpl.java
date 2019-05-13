package com.lt.journey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.CommentDao;
import com.lt.journey.model.Comment;
import com.lt.journey.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;
	
	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.addComment(comment);
	}

	@Override
	public List<Comment> findComment(String parent, String id, int offset, int pageSize) {
		// TODO Auto-generated method stub
		return commentDao.findComment(parent, id, offset, pageSize);
	}

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		return commentDao.findCount();
	}

}
