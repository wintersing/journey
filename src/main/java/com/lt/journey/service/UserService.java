package com.lt.journey.service;

import com.lt.journey.model.User;

public interface UserService{
    
    public User findUserByPhone(String mobile);

	public void addUser(User user);

	public User findUserByUsername(String username);
    
}