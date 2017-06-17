package com.lhs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.dao.UserDao;
import com.lhs.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public boolean doUserLogin(User user) {
		List<User> list = userDao.selectId(user.getUserName());
		if(list.size() == 0){  
            return false;  
        }else{  
            if(list.get(0).getPassWord().equals(user.getPassWord())){                 
                return true;  
            }else{  
                return false;  
            }             
        }  
		
	}

}
