package com.oem.repository;

import java.util.List;

import com.oem.model.Question;

public interface QuestionRepository {

	public List<Question> getAllQuestion(int subId);

	public boolean addQUestion(Question question);
}
