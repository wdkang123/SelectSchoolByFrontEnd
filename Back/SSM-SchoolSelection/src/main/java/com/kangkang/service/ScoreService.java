package com.kangkang.service;

import java.util.List;

import com.kangkang.pojo.Score;

public interface ScoreService {
	List<Score> getAllScoreBySchool();
	List<Score> getScoreBySchoolId(Integer school_id);
	void addScore(Score score);
	void deleteScoreBySchoolId(Integer school_id);
	void updateScore(Score score);
}
