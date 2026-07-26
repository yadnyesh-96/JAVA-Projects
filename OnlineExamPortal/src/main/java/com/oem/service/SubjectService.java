package com.oem.service;

import java.util.List;

import com.oem.model.Subject;

public interface SubjectService {

	public boolean addSubject(Subject sub);

	public List<Subject> getAllSubjects();

	public boolean deleteSubject(int subId);

	public Subject getSubject(Subject sub);
	
	public boolean updateSubject(Subject sub);
}
