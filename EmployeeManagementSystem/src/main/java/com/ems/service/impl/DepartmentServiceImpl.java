package com.ems.service.impl;

import java.util.List;

import com.ems.model.Department;
import com.ems.repository.DepartmentRepository;
import com.ems.repository.impl.DepartmentRepositoryImpl;
import com.ems.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository repository = new DepartmentRepositoryImpl();

	@Override
	public boolean addDepartment(Department department) {

		if (department == null) {
			return false;
		}

		if (department.getDeptName() == null || department.getDeptName().trim().isEmpty()) {
			System.out.println("Department Name cannot be Empty");
			return false;
		}

		if (department.getDescription() == null || department.getDescription().trim().isEmpty()) {
			System.out.println("Department Description Cannot be empty ");
			return false;
		}

		if (repository.existsByDepartmentName(department.getDeptName())) {
			System.out.println("Department Already Exits");
			return false;
		}

		if (department.getDeptName().trim().length() < 2) {
			System.out.println("Dapartment Name Must Be At leat 2 characters ");
			return false;
		}
		return repository.addDepartment(department);
	}

	@Override
	public List<Department> getAllDepartments() {

		return repository.getAllDepartments();
	}

	@Override
	public Department getDepartmentById(int deptId) {

		if (deptId <= 0) {
			System.out.println("Invalid Department Id");
			return null;
		}
		return repository.getDepartmentById(deptId);
	}

	@Override
	public boolean updateDepartment(Department department) {

		if (department == null) {
			return false;
		}

		if (department.getDeptId() <= 0) {
			return false;
		}

		if (department.getDeptName() == null || department.getDeptName().trim().isEmpty()) {
			System.out.println("Department name cannot be empty");
			return false;
		}

		if (department.getDescription() == null || department.getDescription().trim().isEmpty()) {
			System.out.println("Department description cannot be empty");
			return false;
		}

		Department dep = repository.getDepartmentById(department.getDeptId());
		if (dep == null) {
			System.out.println("Department not found");
			return false;
		}
		return repository.updateDepartment(department);
	}

	@Override
	public boolean deleteDepartment(int deptId) {

		if (deptId <= 0) {
			System.out.println("Invalid Department Id");
			return false;
		}
		return repository.deleteDepartment(deptId);
	}

}
