package com.kangkang.mapper;

import java.util.List;

import com.kangkang.pojo.School;

public interface SchoolMapper {
	List<School> selectAllSchool();
	List<School> selectSchoolById(Integer id);
	void insertSchool(School school);
	void deleteSchool(School school);
	void updateSchool(School school);
}
