package com.kangkang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kangkang.pojo.School;
import com.kangkang.service.SchoolService;

@Controller
@CrossOrigin
@ResponseBody
@RequestMapping("/school")
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(value = "/getAllSchool", produces = "application/json;UTF-8", method = RequestMethod.GET)
	public List<School> getAllSchool() {
		List<School> list = new ArrayList<School>();
		list = this.schoolService.getAllSchool();
		return list;
	}
	
	@RequestMapping(value = "/getSchoolById", produces = "application/json;UTF-8", method = RequestMethod.GET)
	public List<School> getSchoolById(@RequestParam("id") Integer id) {
		List<School> list = new ArrayList<School>();
		list = this.schoolService.getSchoolById(id);
		return list;
	}

	@RequestMapping(value = "/addSchool", produces = "application/json;UTF-8", method = RequestMethod.GET)
	public String addSchool(School school) {
		if (null == school.getName()) {
			return "400";
		} 
		this.schoolService.addSchool(school);
		return "200";
	}
	
	@RequestMapping(value = "/delSchoolById", produces = "application/json;UTF-8", method = RequestMethod.GET)
	public String delSchoolById(@RequestParam Integer id) {
		if (null == id) {
			return "400";
		}
		School school = new School();
		school.setId(id);
		this.schoolService.delSchoolById(school);
		return "200";
	}
	
	@RequestMapping(value = "/updSchool", produces = "application/json;UTF-8", method = RequestMethod.GET)
	public String updSchool(School school) {
		this.schoolService.updSchoolById(school);
		return "200";
	}
	
	@RequestMapping(value = "/selectSchool", produces = "application/json;UTF-8", method = RequestMethod.GET)
	public List<School> getSchoolBySelect(
			@RequestParam String rank,
			@RequestParam String cost,
			@RequestParam String tofel,
			@RequestParam String ssat
			) {
		List<School> list = new ArrayList<>();
		
		return list;
	}
}
