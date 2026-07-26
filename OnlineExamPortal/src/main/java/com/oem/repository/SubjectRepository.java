package com.oem.repository;

import java.util.List;

import com.oem.model.Subject;

public interface SubjectRepository {

	public boolean addSubject(Subject sub);

	public List<Subject> getAllSubjects();

	public boolean deleteSubject(int subId);

	public Subject getSubject(Subject sub);

	public boolean updateSubject(Subject sub);
}
