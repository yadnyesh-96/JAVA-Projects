package com.ems.repository;

import java.util.List;

import com.ems.model.Employee;

public interface EmployeeRepository {

	boolean addEmployee(Employee employee);

	Employee login(String usernameOrEmail, String password);

	Employee getEmployeeById(int empPk);

	Employee getEmployeeByEmployeeId(String employeeId);

	List<Employee> getAllEmployees();

	boolean updateEmployee(Employee employee);

	boolean deleteEmployee(int empPk);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);

	String getLastEmployeeId();
}