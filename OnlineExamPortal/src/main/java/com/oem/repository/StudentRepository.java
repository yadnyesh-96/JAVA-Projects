package com.oem.repository;

import com.oem.model.Student;

public interface StudentRepository {

	public boolean addStudent(Student std);

	public String generateStudentId();

	public boolean studentLogin(String login, String password);
}
