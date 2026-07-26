package com.oem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.oem.model.Subject;
import com.oem.utility.DBConnection;

public class SubjectRepositoryImpl implements SubjectRepository {

	// Add subject in db
	@Override
	public boolean addSubject(Subject sub) {

		try {
			Connection conn = DBConnection.getConnection();

			PreparedStatement ps = conn.prepareStatement("INSERT INTO subjects (sub_name,sub_desc) VALUES (?,?)");
			ps.setString(1, sub.getSubName());
			ps.setString(2, sub.getSubDesc());

			int result = ps.executeUpdate();
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// get all subject list from db
	@Override
	public List<Subject> getAllSubjects() {

		List<Subject> ls = new ArrayList<>();

		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT *FROM subjects");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Subject s = new Subject();

				s.setSubId(rs.getInt(1));
				s.setSubName(rs.getString(2));
				s.setSubDesc(rs.getString(3));

				ls.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	// delete subject by id
	@Override
	public boolean deleteSubject(int subId) {

		try {

			Connection conn = DBConnection.getConnection();

			PreparedStatement ps = conn.prepareStatement("DELETE FROM subjects WHERE sub_id=?");

			ps.setInt(1, subId);

			int row = ps.executeUpdate();

			if (row > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Subject getSubject(Subject sub) {

		Subject sub1 = null;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT *FROM subjects WHERE sub_id=? OR sub_name=?");

			ps.setInt(1, sub.getSubId());
			ps.setString(2, sub.getSubName());

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				sub1 = new Subject();

				sub1.setSubId(rs.getInt("sub_id"));
				sub1.setSubName(rs.getString("sub_name"));
				sub1.setSubDesc(rs.getString("sub_desc"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sub1;
	}

	@Override
	public boolean updateSubject(Subject sub) {

		try {
			Connection conn = DBConnection.getConnection();

			PreparedStatement ps = conn.prepareStatement("UPDATE subjects SET sub_name=?, sub_desc=? WHERE sub_id=?");

			ps.setString(1, sub.getSubName());
			ps.setString(2, sub.getSubDesc());
			ps.setInt(3, sub.getSubId());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
