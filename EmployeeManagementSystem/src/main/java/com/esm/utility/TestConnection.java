package com.esm.utility;

import java.util.List;

import com.ems.repository.DepartmentRepository;
import com.esm.model.Department;
import com.esm.repository.impl.DepartmentRepositoryImpl;

public class TestConnection {

	public static void main(String[] args) {

		DepartmentRepository repo = new DepartmentRepositoryImpl();

//		testAddDepartment(repo);
//		testGetAllDepartment(repo);
//		testGetDeptById(repo);
//		testUpdateDepartment(repo);
		testDeleteDep(repo);

	}

	public static void testAddDepartment(DepartmentRepository repo) {
		Department dep = new Department();

		dep.setDeptName("Support");
		dep.setDescription("Customer Support Team");

		boolean res = repo.addDepartment(dep);

		System.out.println("Department Added : " + res);
	}

	public static void testGetAllDepartment(DepartmentRepository repo) {

		List<Department> list = repo.getAllDepartments();

		for (Department dep : list) {
			System.out.println(dep.getDeptId() + "\t" + dep.getDeptName() + "\t" + dep.getDescription());
		}
	}

	public static void testGetDeptById(DepartmentRepository repo) {
		Department dep = repo.getDepartmentById(1);
		System.out.println(dep.getDeptId() + "\t" + dep.getDeptName() + "\t" + dep.getDescription());

	}

	public static void testUpdateDepartment(DepartmentRepository repo) {
		Department dep = repo.getDepartmentById(1);

		dep.setDeptName("Human Resource");
		dep.setDescription("Updated HR department");

		boolean res = repo.updateDepartment(dep);

		System.out.println("Updated: " + res);
	}

	public static void testDeleteDep(DepartmentRepository repo) {

		boolean res = repo.deleteDepartment(5);
		System.out.println("Deleted : " + res);

	}
}
