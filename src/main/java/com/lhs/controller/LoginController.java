package com.lhs.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lhs.service.UserServiceImpl;
import com.lhs.user.entity.User;

@Controller
@RequestMapping("/test") 
public class LoginController {
	 @Autowired  
	 private UserServiceImpl userService; 
	 
	 @RequestMapping("/login") //url  
	 public String login(User user, Model model){  
	     if(userService.doUserLogin(user)){
	    	 System.out.println("登录成功");
	         model.addAttribute("successMsg", "登陆成功！");//返回到页面所夹带的参数  
	         model.addAttribute("name", user.getUserName());  
	         return "/success";//返回的页面  
	     }else{  
	    	 System.out.println("登录失败");
	         model.addAttribute("failMsg", "用户不存在或密码错误！");  
	         return "/fail";  
	     }     
	 }
	 
	 
	 
	@RequestMapping("/media")
	@ResponseBody
	public Map<String, String> testParseJson(String name, Model model){
	 	System.out.println("进来了");
 		Map<String, String> map = new HashMap<String,String>();
		map.put("key", name);
		return map;
	}

}
