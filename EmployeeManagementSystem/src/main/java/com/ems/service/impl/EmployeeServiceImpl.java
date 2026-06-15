package com.ems.service.impl;

import java.util.List;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.impl.EmployeeRepositoryImpl;
import com.ems.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository repository = new EmployeeRepositoryImpl();

	@Override
	public boolean registerEmployee(Employee employee) {

		if (employee == null) {
			return false;
		}

		if (employee.getUsername() == null || employee.getUsername().trim().isEmpty()) {
			System.out.println("Username Cannot be Empty");
			return false;
		}

		if (employee.getEmail() == null || employee.getEmail().trim().isEmpty()) {
			System.out.println("Email cannot be Empty");
			return false;
		}

		if (repository.existsByUsername(employee.getUsername())) {
			System.out.println("Username aleady Exists");
			return false;
		}

		if (repository.existsByEmail(employee.getEmail())) {
			System.out.println("Email is Aready Taken by another user");
			return false;
		}

		String employeeId = generateEmployeeId();
		employee.setEmployeeId(employeeId);

		return repository.addEmployee(employee);
	}

	@Override
	public Employee login(String usernameOrEmail, String password) {

		if (usernameOrEmail == null || usernameOrEmail.trim().isEmpty()) {
			System.out.println("Username or Email Required");
			return null;
		}

		if (password == null || password.trim().isEmpty()) {
			System.out.println("Password Must be required");
			return null;
		}
		return repository.login(usernameOrEmail, password);
	}

	@Override
	public Employee getEmployeeById(int empPk) {

		if (empPk <= 0) {
			return null;
		}

		return repository.getEmployeeById(empPk);
	}

	@Override
	public Employee getEmployeeByEmployeeId(String employeeId) {

		if (employeeId == null || employeeId.trim().isEmpty()) {
			return null;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {

		return repository.getAllEmployees();
	}

	@Override
	public boolean updateEmployee(Employee employee) {

		if (employee == null) {
			return false;
		}

		return repository.updateEmployee(employee);
	}

	@Override
	public boolean updateEmployeeByAdmin(Employee employee) {

		if (employee == null) {
			return false;
		}

		Employee existingEmp = repository.getEmployeeByEmployeeId(employee.getEmployeeId());

		if (existingEmp == null) {
			System.out.println("Employee not found");
			return false;
		}

		return repository.updateEmployeeByAdmin(employee);
	}

	@Override
	public boolean deleteEmployee(int empPk) {

		if (empPk <= 0) {
			return false;
		}
		return repository.deleteEmployee(empPk);
	}

	@Override
	public String generateEmployeeId() {
		String lastEmployeeId = repository.getLastEmployeeId();

		if (lastEmployeeId == null) {
			lastEmployeeId = "EMP001";
		}

		String lastNumber = lastEmployeeId.substring(3);

		int num = Integer.parseInt(lastNumber);

		num++;
		return String.format("EMP%03d", num);
	}

}
