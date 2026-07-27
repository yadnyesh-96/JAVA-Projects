package com.oem.service;

import java.util.List;

import com.oem.model.Question;
import com.oem.repository.QuestionRepository;
import com.oem.repository.QuestionRepositoryImpl;

public class QuestionServiceImpl implements QuestionService {

	QuestionRepository repository = new QuestionRepositoryImpl();

	@Override
	public List<Question> getAllQuestion(int subId) {
		return repository.getAllQuestion(subId);
	}

	@Override
	public boolean addQUestion(Question question) {

		return repository.addQUestion(question);
	}

}
