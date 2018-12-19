package com.lt.journey.service;

import com.lt.journey.domain.User;

public interface UserService{
    
    public User findUserByMobile(String mobile);

	public void addUser(User user);
    
}