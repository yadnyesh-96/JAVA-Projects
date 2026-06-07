package com.ems.repository;

import java.util.List;

import com.esm.model.Department;

public interface DepartmentRepository {
	
	boolean addDepartment(Department department);
	
	List<Department> getAllDepartments();
	
	Department getDepartmentById(int deptId);
	
	boolean updateDepartment(Department department);
	
	boolean deleteDepartment(int deptId);
	
}
