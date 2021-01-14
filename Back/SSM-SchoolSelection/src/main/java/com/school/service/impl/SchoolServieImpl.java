package com.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.mapper.SchoolMapper;
import com.school.pojo.School;
import com.school.service.SchoolService;


@Service
@Transactional
public class SchoolServieImpl implements SchoolService {
	@Autowired
	private SchoolMapper schoolMapper;

	@Override
	public List<School> getAllSchool() {
		return this.schoolMapper.selectAllSchool();
	}
	
	@Override
	public List<School> getSchoolById(Integer id) {
		return this.schoolMapper.selectSchoolById(id);
	}

	@Override
	public void addSchool(School school) {
		this.schoolMapper.insertSchool(school);
	}

	@Override
	public void delSchoolById(School school) {
		this.schoolMapper.deleteSchool(school);
	}

	@Override
	public void updSchoolById(School school) {
		this.schoolMapper.updateSchool(school);
	}
}
