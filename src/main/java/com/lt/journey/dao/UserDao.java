package com.lt.journey.dao;

import com.lt.journey.model.User;

public interface UserDao {
    public User findByUsername(String username);
    public User findUserByMobile(String mobile);
	public User addUser(User user);
}