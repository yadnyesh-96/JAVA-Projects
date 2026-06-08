package com.ems.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import com.esm.utility.DBConnection;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public boolean addEmployee(Employee employee) {
		boolean res = false;

		try {
			Connection conn = DBConnection.getConnection();

			String query = "INSERT INTO employee "
					+ "(employee_id,username,first_name,last_name,email,password,mobile,gender,department_id,joining_date) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, employee.getEmployeeId());
			ps.setString(2, employee.getUsername());
			ps.setString(3, employee.getFirstName());
			ps.setString(4, employee.getLastName());
			ps.setString(5, employee.getEmail());
			ps.setString(6, employee.getPassword());
			ps.setString(7, employee.getMobile());
			ps.setString(8, employee.getGender());
			ps.setInt(9, employee.getDepartmentId());
			ps.setString(10, employee.getJoiningDate());

			if (ps.executeUpdate() > 0) {
				res = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	@Override
	public Employee login(String usernameOrEmail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int empPk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeByEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int empPk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsByUsername(String username) {
		boolean res = false;
		try {

			Connection conn = DBConnection.getConnection();

			String query = "SELECT COUNT(*) FROM employee WHERE username=?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				res = rs.getInt(1) > 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	@Override
	public boolean existsByEmail(String email) {

		boolean res = false;

		try {

			Connection conn = DBConnection.getConnection();

			String query = "SELECT COUNT(*) FROM employee WHERE email=?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				res = rs.getInt(1) > 0;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	@Override
	public String getLastEmployeeId() {
		String employeeId = null;

		try {

			Connection conn = DBConnection.getConnection();

			String query = "SELECT employee_id FROM employee ORDER BY emp_pk DESC LIMIT 1";

			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				employeeId = rs.getString("employee_id");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeId;
	}

}
