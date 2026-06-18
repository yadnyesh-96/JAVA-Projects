package com.ems.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ems.model.Admin;
import com.ems.repository.AdminRepository;
import com.esm.utility.DBConnection;

public class AdminRepositoryImpl implements AdminRepository {

	@Override
	public Admin adminLogin(String username, String password) {
		Admin adm = null;

		try {

			Connection conn = DBConnection.getConnection();

			String query = "SELECT *FROM admin WHERE(username=? AND password=?)";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				adm = new Admin();

				adm.setAdminId(rs.getInt("admin_id"));
				adm.setUsername(rs.getString("username"));
				adm.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return adm;
	}

}
