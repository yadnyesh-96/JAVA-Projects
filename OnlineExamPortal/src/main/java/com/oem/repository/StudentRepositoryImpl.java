package com.oem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Year;

import com.oem.model.Student;
import com.oem.utility.DBConnection;

public class StudentRepositoryImpl implements StudentRepository {

	@Override
	public boolean addStudent(Student std) {

		try {

			Connection conn = DBConnection.getConnection();

			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO students (student_ID, full_name,email,mobile_number,address,date_of_birth,sub_id,username,password) VALUES (?,?,?,?,?,?,?,?,?)");

			ps.setString(1, std.getStudentID());
			ps.setString(2, std.getFullName());
			ps.setString(3, std.getEmail());
			ps.setString(4, std.getMobileNumber());
			ps.setString(5, std.getAddress());
			ps.setString(6, std.getDOB());
			ps.setInt(7, std.getSub_id());
			ps.setString(8, std.getUsername());
			ps.setString(9, std.getPassword());

			int result = ps.executeUpdate();

			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public String generateStudentId() {
		try {
			int currentYear = Year.now().getValue();

			String prefix = "OEM" + currentYear;

			Connection conn = DBConnection.getConnection();

			String sql = "SELECT student_ID FROM students " + "WHERE student_ID LIKE ? "
					+ "ORDER BY student_ID DESC LIMIT 1";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, prefix + "%");

			ResultSet rs = ps.executeQuery();

			int nextNumber = 1;

			if (rs.next()) {

				String lastStudentId = rs.getString("student_ID");

				String numberPart = lastStudentId.substring(prefix.length());

				nextNumber = Integer.parseInt(numberPart) + 1;
			}

			return prefix + String.format("%04d", nextNumber);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean studentLogin(String login, String password) {

		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM students WHERE (email=? OR username=?) AND password=?");

			ps.setString(1, login);
			ps.setString(2, login);
			ps.setString(3, password);

			ResultSet rs = ps.executeQuery();

			return rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
