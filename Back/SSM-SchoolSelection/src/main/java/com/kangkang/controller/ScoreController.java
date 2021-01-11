package com.kangkang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kangkang.pojo.Score;
import com.kangkang.service.ScoreService;

@Controller
@CrossOrigin
@ResponseBody
@RequestMapping("/score")
public class ScoreController {
  
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping(value = "/getAllScoreBySchool", produces = "application/json;UTF-8", method = RequestMethod.GET)
	public List<Score> getAllScoreBySchool() {
		List<Score> list = new ArrayList<Score>();
		list = this.scoreService.getAllScoreBySchool();
		return list;
	}
}
