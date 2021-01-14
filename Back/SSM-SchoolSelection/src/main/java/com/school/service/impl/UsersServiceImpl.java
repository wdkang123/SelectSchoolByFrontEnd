package com.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.mapper.UsersMapper;
import com.school.pojo.Users;
import com.school.service.UsersService;


@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users checkUser(String username) {
		return this.usersMapper.selectUserName(username);
	}
	
}
