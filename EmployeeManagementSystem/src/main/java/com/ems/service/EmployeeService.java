package com.ems.service;

import java.util.List;

import com.ems.model.Employee;

public interface EmployeeService {

	boolean registerEmployee(Employee employee);

	Employee login(String usernameOrEmail, String password);

	Employee getEmployeeById(int empPk);

	Employee getEmployeeByEmployeeId(String employeeId);

	List<Employee> getAllEmployees();

	boolean updateEmployee(Employee employee);

	boolean updateEmployeeByAdmin(Employee employee);

	boolean deleteEmployee(int empPk);

	String generateEmployeeId();
}
