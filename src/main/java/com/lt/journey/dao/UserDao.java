package com.lt.journey.dao;

import org.springframework.stereotype.Repository;

import com.lt.journey.model.User;

@Repository
public interface UserDao {
    public User findByUsername(String username);
    public User findUserByMobile(String mobile);
	public User addUser(User user);
}