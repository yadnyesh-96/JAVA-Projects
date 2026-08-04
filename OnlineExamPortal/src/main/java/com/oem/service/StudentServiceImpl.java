package com.oem.service;

import com.oem.model.Student;
import com.oem.repository.StudentRepository;
import com.oem.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {

	StudentRepository repository = new StudentRepositoryImpl();

	@Override
	public boolean addStudent(Student std) {

		return repository.addStudent(std);
	}

	@Override
	public boolean studentLogin(String login, String password) {

		return repository.studentLogin(login, password);
	}

}
