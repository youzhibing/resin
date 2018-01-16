package com.you.lee.resin.service.impl;

import org.springframework.stereotype.Service;

import com.you.lee.resin.model.User;
import com.you.lee.resin.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Override
	public User getUser(int userId) {
		User user = new User();
		user.setId(userId);
		user.setAge(25);
		user.setName("小桥流水");
		
		return user;
	}

}
