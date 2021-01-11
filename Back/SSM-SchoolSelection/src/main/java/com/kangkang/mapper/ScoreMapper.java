package com.kangkang.mapper;

import java.util.List;

import com.kangkang.pojo.Score;

public interface ScoreMapper {
	List<Score> getAllScoreBySchool();
	List<Score> getScoreBySchoolId(Integer school_id);
	void addScore(Score score);
	void delScoreById(Integer id);
	void updScoreById(Score score);
}
