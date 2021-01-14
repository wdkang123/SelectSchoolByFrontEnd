package com.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.mapper.ScoreMapper;
import com.school.pojo.Score;
import com.school.service.ScoreService;

@Service
@Transactional
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override
	public List<Score> getAllScoreBySchool() {
		return this.scoreMapper.getAllScoreBySchool();
	}

	@Override
	public List<Score> getScoreBySchoolId(Integer school_id) {
		return this.scoreMapper.getScoreBySchoolId(school_id);
	}

	@Override
	public void addScore(Score score) {
		this.scoreMapper.addScore(score);
	}

	@Override
	public void deleteScoreBySchoolId(Integer school_id) {
		this.scoreMapper.delScoreById(school_id);
	}

	@Override
	public void updateScore(Score score) {
		this.scoreMapper.updScoreById(score);
	}
	
}
