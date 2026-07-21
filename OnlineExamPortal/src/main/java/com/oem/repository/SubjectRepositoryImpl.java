package com.oem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.oem.model.Subject;
import com.oem.utility.DBConnection;

public class SubjectRepositoryImpl implements SubjectRepository {

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

}
