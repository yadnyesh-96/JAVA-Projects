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

}
