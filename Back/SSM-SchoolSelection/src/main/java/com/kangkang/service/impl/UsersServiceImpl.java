package com.kangkang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kangkang.mapper.UsersMapper;
import com.kangkang.pojo.Users;
import com.kangkang.service.UsersService;


@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users checkUser(String username) {
		// TODO Auto-generated method stub
		return this.usersMapper.selectUserName(username);
	}
	
}
