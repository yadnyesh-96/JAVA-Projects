package com.oem.service;

import com.oem.model.Subject;
import com.oem.repository.SubjectRepository;
import com.oem.repository.SubjectRepositoryImpl;

public class SubjectServiceImpl implements SubjectService {

	SubjectRepository repository = new SubjectRepositoryImpl();

	@Override
	public boolean addSubject(Subject sub) {

		if (sub.getSubName().trim().isEmpty()) {
			return false;
		}

		if (sub.getSubDesc().trim().isEmpty()) {
			return false;
		}

		return repository.addSubject(sub);
	}

}
