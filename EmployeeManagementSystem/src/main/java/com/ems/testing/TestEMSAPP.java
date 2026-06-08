package com.ems.testing;

import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.repository.DepartmentRepository;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.impl.EmployeeRepositoryImpl;

public class TestEMSAPP {

	public static void main(String[] args) {

//		DepartmentRepository repository = new DepartmentRepositoryImpl();

		EmployeeRepository repository = new EmployeeRepositoryImpl();

//		testgetDept(repository);

		EmployeeRepository empR = new EmployeeRepositoryImpl();
		testLoginUser(empR);
		
		/*

		System.out.println(empR.existsByUsername("rahul123"));

		System.out.println(empR.existsByEmail("rahul@gmail.com"));

		System.out.println(empR.getLastEmployeeId());

		/*
		 * Employee emp = new Employee();
		 * 
		 * emp.setEmployeeId("EMP001"); emp.setUsername("rahul123");
		 * emp.setFirstName("Rahul"); emp.setLastName("Sharma");
		 * emp.setEmail("rahul@gmail.com"); emp.setPassword("12345");
		 * emp.setMobile("9876543210"); emp.setGender("Male"); emp.setDepartmentId(1);
		 * emp.setJoiningDate("2026-06-08");
		 * 
		 * EmployeeRepository r = new EmployeeRepositoryImpl();
		 * 
		 * r.addEmployee(emp);
		 */
	}

	public static void testgetDept(DepartmentRepository repo) {

		List<Department> dep = repo.getAllDepartments();

		for (Department d : dep) {
			System.out.println(d.getDeptId() + "\t" + d.getDeptName() + "\t\t" + d.getDescription());
		}
	}

	public static void testLoginUser(EmployeeRepository emp) {
		Employee em = emp.login("rahul123", "12345");
		System.out
				.println(em.getUsername() + "\t\t" + em.getFirstName() + "\t" + em.getLastName() + "\t" + em.getEmail());
	}

}
