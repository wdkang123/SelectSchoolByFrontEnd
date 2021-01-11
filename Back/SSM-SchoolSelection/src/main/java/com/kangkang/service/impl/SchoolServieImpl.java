package com.kangkang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kangkang.mapper.SchoolMapper;
import com.kangkang.pojo.School;
import com.kangkang.service.SchoolService;


@Service
@Transactional
public class SchoolServieImpl implements SchoolService {
	@Autowired
	private SchoolMapper schoolMapper;

	@Override
	public List<School> getAllSchool() {
		// TODO Auto-generated method stub
		return this.schoolMapper.selectAllSchool();
	}
	
	@Override
	public List<School> getSchoolById(Integer id) {
		// TODO Auto-generated method stub
		return this.schoolMapper.selectSchoolById(id);
	}

	@Override
	public void addSchool(School school) {
		// TODO Auto-generated method stub
		this.schoolMapper.insertSchool(school);
	}

	@Override
	public void delSchoolById(School school) {
		// TODO Auto-generated method stub
		this.schoolMapper.deleteSchool(school);
	}

	@Override
	public void updSchoolById(School school) {
		// TODO Auto-generated method stub
		this.schoolMapper.updateSchool(school);
	}
}
