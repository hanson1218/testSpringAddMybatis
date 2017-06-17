package com.lhs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/testspring") 
public class TestSpringContrller {

	
	@RequestMapping("/jsonorxml")
	@ResponseBody
	public Map<String,String> testParseJson(){
 		Map<String, String> map = new HashMap<String,String>();
		map.put("key", "hxx");
		return map;
		
	}
}
