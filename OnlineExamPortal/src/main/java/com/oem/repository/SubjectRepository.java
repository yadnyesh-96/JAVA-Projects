package com.oem.repository;

import java.util.List;

import com.oem.model.Subject;

public interface SubjectRepository {
	
	public boolean addSubject(Subject sub);
	
	public List<Subject> getAllSubjects();
}
