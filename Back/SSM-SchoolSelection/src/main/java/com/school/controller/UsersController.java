package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.pojo.Users;
import com.school.service.UsersService;


@Controller
@CrossOrigin
@ResponseBody
@RequestMapping("/user")
public class UsersController {
	@Autowired
	private UsersService userService;
	
	@RequestMapping(value="/checkUser", produces="application/json;charset=UTF-8", method=RequestMethod.GET)
	public String checkUser(@RequestParam String token) {
		/**
		 * username:gjsxy
		 * password:gjs02.
		 * token:gjsxy---gjs02.
		 * 
		 **/
		//拆分token
		String[] split_str = token.split("---");
		String username = split_str[0];
		String password = split_str[1];
		//这里要验证是否正确
		Users user_data = this.userService.checkUser(username);
		if(user_data == null) {
			return "error";
		}
		if(user_data.getPassword().equals(password)) {
			return user_data.getDepart_id();
		}else {
			return "error";
		}
		
	}
}



