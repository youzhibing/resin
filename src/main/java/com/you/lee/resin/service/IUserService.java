package com.you.lee.resin.service;

import com.you.lee.resin.model.User;

public interface IUserService {
	
	/**
	 * 获取用户详细信息
	 * @param userId
	 * @return
	 */
	User getUser(int userId);
}
