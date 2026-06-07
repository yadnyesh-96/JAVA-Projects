package com.esm.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.repository.DepartmentRepository;
import com.esm.model.Department;
import com.esm.utility.DBConnection;

public class DepartmentRepositoryImpl implements DepartmentRepository {

	@Override
	public boolean addDepartment(Department department) {

		boolean res = false;

		try {
			Connection conn = DBConnection.getConnection();

			String query = "INSERT INTO department(dept_name,description) VALUES(?,?)";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, department.getDeptName());
			ps.setString(2, department.getDescription());

			int value = ps.executeUpdate();

			if (value > 0) {
				res = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return res;
	}

	@Override
	public List<Department> getAllDepartments() {

		List<Department> dept = new ArrayList<>();

		try {

			Connection conn = DBConnection.getConnection();

			String query = "SELECT *FROM department";

			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Department dep = new Department();

				dep.setDeptId(rs.getInt("dept_id"));
				dep.setDeptName(rs.getString("dept_name"));
				dep.setDescription(rs.getString("description"));

				dept.add(dep);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dept;
	}

	@Override
	public Department getDepartmentById(int deptId) {

		Department department = null;

		try {

			Connection conn = DBConnection.getConnection();
			String query = "SELECT *FROM department WHERE dept_id=?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, deptId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				department = new Department();

				department.setDeptId(rs.getInt("dept_id"));
				department.setDeptName(rs.getString("dept_name"));
				department.setDescription(rs.getString("description"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return department;
	}

	@Override
	public boolean updateDepartment(Department department) {
		boolean status = false;

		try {
			Connection conn = DBConnection.getConnection();

			String query = "UPDATE department  SET dept_name=?,description=? WHERE dept_id=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, department.getDeptName());
			ps.setString(2, department.getDescription());
			ps.setInt(3, department.getDeptId());

			int value = ps.executeUpdate();
			if (value > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteDepartment(int deptId) {
		boolean status = false;

		try {
			Connection conn = DBConnection.getConnection();

			String query = "DELETE FROM department WHERE dept_id=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, deptId);
			int val = ps.executeUpdate();
			if (val > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

}
