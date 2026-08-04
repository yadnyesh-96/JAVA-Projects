package com.oem.service;

import com.oem.model.Student;

public interface StudentService {

	public boolean addStudent(Student std);
	
	public boolean studentLogin(String login, String password);
}
