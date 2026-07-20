package com.vst.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vst.model.Customer;
import com.vst.model.User;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public Integer saveUser(User user, Connection connection) throws SQLException {

		String sql = """
				INSERT INTO users
				(role_id, username, password_hash, email, mobile_number)
				VALUES(?,?,?,?,?)
				""";

		// Statement.RETURN_GENERATED_KEYS
		// After executing this INSERT statement, return any auto-generated keys (such
		// as the primary key)
		try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			ps.setInt(1, user.getRoleId());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPasswordHash());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getMobileNumber());

			int rows = ps.executeUpdate();

			if (rows > 0) {
				try (ResultSet rs = ps.getGeneratedKeys()) {
					if (rs.next()) {
						return rs.getInt(1);
					}
				}
			}
		}
		throw new SQLException("Failed to save user");
	}

	@Override
	public void saveCustomer(Customer customer, Connection connection) throws SQLException {

		String sql = """
				INSERT INTO customers
				(	user_id,
					first_name,
					last_name,
					address_line1,
					address_line2,
					city,
					state,
					pincode,
					gender,
					profile_image
				)
				VALUES(?,?,?,?,?,?,?,?,?,?)
				""";

		try (PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setInt(1, customer.getUserId());
			ps.setString(2, customer.getFirstName());
			ps.setString(3, customer.getLastName());
			ps.setString(4, customer.getAddressLine1());
			ps.setString(5, customer.getAddressLine2());
			ps.setString(6, customer.getCity());
			ps.setString(7, customer.getState());
			ps.setString(8, customer.getPincode());
			ps.setString(9, customer.getGender());
			ps.setBytes(10, customer.getProfileImage());

			int rows = ps.executeUpdate();

			if (rows == 0) {
				throw new SQLException("Failed to Save Customer");
			}
		}
	}

}
