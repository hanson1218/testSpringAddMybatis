package com.lhs.service;

import org.springframework.stereotype.Service;

import com.lhs.user.entity.User;


public interface UserService {
	boolean doUserLogin(User user);  
}
