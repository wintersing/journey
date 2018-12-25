package com.lt.journey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.journey.dao.UserDao;
import com.lt.journey.model.User;
import com.lt.journey.service.UserService;;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public User findUserByMobile(String mobile) {
		// TODO Auto-generated method stub
		return userDao.findUserByMobile(mobile);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	
}