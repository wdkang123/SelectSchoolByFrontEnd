package com.kangkang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kangkang.mapper.ScoreMapper;
import com.kangkang.pojo.Score;
import com.kangkang.service.ScoreService;

@Service
@Transactional
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override
	public List<Score> getAllScoreBySchool() {
		// TODO Auto-generated method stub
		return this.scoreMapper.getAllScoreBySchool();
	}

	@Override
	public List<Score> getScoreBySchoolId(Integer school_id) {
		// TODO Auto-generated method stub
		return this.scoreMapper.getScoreBySchoolId(school_id);
	}

	@Override
	public void addScore(Score score) {
		// TODO Auto-generated method stub
		this.scoreMapper.addScore(score);
	}

	@Override
	public void deleteScoreBySchoolId(Integer school_id) {
		// TODO Auto-generated method stub
		this.scoreMapper.delScoreById(school_id);
	}

	@Override
	public void updateScore(Score score) {
		// TODO Auto-generated method stub
		this.scoreMapper.updScoreById(score);
	}
	
}
