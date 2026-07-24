package com.oem.service;

import java.util.List;

import com.oem.model.Subject;

public interface SubjectService {
	
	public boolean addSubject(Subject sub);
	
	public List<Subject> getAllSubjects();
}
