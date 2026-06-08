package com.ems.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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

		Employee emp = null;

		try {

			Connection conn = DBConnection.getConnection();

			String query = "SELECT * FROM employee " + "WHERE (username=? OR email=?) " + "AND password=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, usernameOrEmail);
			ps.setString(2, usernameOrEmail);
			ps.setString(3, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				emp = new Employee();

				emp.setEmpPk(rs.getInt("emp_pk"));
				emp.setEmployeeId(rs.getString("employee_id"));
				emp.setUsername(rs.getString("username"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setMobile(rs.getString("mobile"));
				emp.setGender(rs.getString("gender"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setJoiningDate(rs.getString("joining_date"));
				emp.setStatus(rs.getString("status"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public Employee getEmployeeById(int empPk) {
		Employee emp = null;

		try {
			Connection conn = DBConnection.getConnection();

			String query = "SELECT * FROM employee WHERE emp_pk=?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, empPk);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmpPk(rs.getInt("emp_pk"));
				emp.setEmployeeId(rs.getString("employee_id"));
				emp.setUsername(rs.getString("username"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setMobile(rs.getString("mobile"));
				emp.setGender(rs.getString("gender"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setJoiningDate(rs.getString("joining_date"));
				emp.setStatus(rs.getString("status"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public Employee getEmployeeByEmployeeId(String employeeId) {
		Employee emp = null;

		try {
			Connection conn = DBConnection.getConnection();

			String query = "SELECT *FROM employee WHERE employee_id=?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, employeeId);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmpPk(rs.getInt("emp_pk"));
				emp.setEmployeeId(rs.getString("employee_id"));
				emp.setUsername(rs.getString("username"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setMobile(rs.getString("mobile"));
				emp.setGender(rs.getString("gender"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setJoiningDate(rs.getString("joining_date"));
				emp.setStatus(rs.getString("status"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> empLs = new ArrayList<>();

		try {

			Connection conn = DBConnection.getConnection();

			String query = "SELECT *FROM employee";

			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				// create the object here of Employee from model
				Employee emp = new Employee();

				emp.setEmpPk(rs.getInt("emp_pk"));
				emp.setEmployeeId(rs.getString("employee_id"));
				emp.setUsername(rs.getString("username"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setMobile(rs.getString("mobile"));
				emp.setGender(rs.getString("gender"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setJoiningDate(rs.getString("joining_date"));
				emp.setStatus(rs.getString("status"));

				empLs.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return empLs;
	}

	@Override
	public boolean updateEmployee(Employee employee) {

		boolean res = false;

		try {
			Connection conn = DBConnection.getConnection();

			String query = "UPDATE employee SET username=?,first_name=?,last_name=?,email=?,password=?,mobile=?,gender=? WHERE employee_id=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, employee.getUsername());
			ps.setString(2, employee.getFirstName());
			ps.setString(3, employee.getLastName());
			ps.setString(4, employee.getEmail());
			ps.setString(5, employee.getPassword());
			ps.setString(6, employee.getMobile());
			ps.setString(7, employee.getGender());
			ps.setString(8, employee.getEmployeeId());

			if (ps.executeUpdate() > 0) {
				res = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public boolean updateEmployeeByAdmin(Employee employee) {

		boolean res = false;

		try {

			Connection conn = DBConnection.getConnection();

			String query = "UPDATE employee SET username=?,password=?,department_id=?,status=? WHERE employee_id=?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, employee.getUsername());
			ps.setString(2, employee.getPassword());
			ps.setInt(3, employee.getDepartmentId());
			ps.setString(4, employee.getStatus());
			ps.setString(5, employee.getEmployeeId());

			if (ps.executeUpdate() > 0) {
				res = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	@Override
	public boolean deleteEmployee(int empPk) {
		boolean res = false;

		try {

			Connection conn = DBConnection.getConnection();

			String query = "DELETE FROM employee WHERE emp_pk=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, empPk);

			if (ps.executeUpdate() > 0) {
				res = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
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
