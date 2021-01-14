package com.school.mapper;

import java.util.List;

import com.school.pojo.Score;

public interface ScoreMapper {
	List<Score> getAllScoreBySchool();
	List<Score> getScoreBySchoolId(Integer school_id);
	void addScore(Score score);
	void delScoreById(Integer id);
	void updScoreById(Score score);
}
