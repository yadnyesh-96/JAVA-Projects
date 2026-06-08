package com.ems.service;

import java.util.List;

import com.ems.model.Department;

public interface DepartmentService {

	boolean addDepartment(Department department);

	List<Department> getAllDepartments();

	Department getDepartmentById(int deptId);

	boolean updateDepartment(Department department);

	boolean deleteDepartment(int deptId);
}
