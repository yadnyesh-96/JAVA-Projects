package org.v.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.v.model.Candidate;
import org.v.utility.DBConfig;

public class VoterRepositoryImpl implements VoterRepository {

	@Override
	public boolean registerVoter(Candidate candidate) {
		boolean res = false;

		try {

			Connection conn = DBConfig.getConnection();
			String query = "INSERT INTO candidates (voter_name,voter_age,district,state,email,password) VALUES (?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, candidate.getName());
			pstmt.setInt(2, candidate.getAge());
			pstmt.setString(3, candidate.getDistrict());
			pstmt.setString(4, candidate.getState());
			pstmt.setString(5, candidate.getEmail());
			pstmt.setString(6, candidate.getPassword());

			if (pstmt.executeUpdate() > 0) {
				res = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

}
