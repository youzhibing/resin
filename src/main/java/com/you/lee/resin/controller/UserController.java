package com.you.lee.resin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.you.lee.resin.model.User;
import com.you.lee.resin.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/getUser", method=RequestMethod.POST)
	public User getUser(@RequestParam(required=true) int userId) {
		System.out.println("userId : " + userId);
		return userService.getUser(userId);
	}
	
}
