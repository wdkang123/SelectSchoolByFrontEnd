package com.kangkang.service;

import java.util.List;

import com.kangkang.pojo.School;


public interface SchoolService {
	List<School> getAllSchool();
	List<School> getSchoolById(Integer id);
	void addSchool(School school);
	void delSchoolById(School school);
	void updSchoolById(School school);
}
