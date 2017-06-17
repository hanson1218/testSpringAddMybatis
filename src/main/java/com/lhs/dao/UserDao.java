package com.lhs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lhs.user.entity.User;

@Service
public interface UserDao {
	List<User> selectId(String username);  
}
