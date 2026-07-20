package com.vst.repository;

import java.sql.Connection;
import java.sql.SQLException;

import com.vst.model.Customer;
import com.vst.model.User;

public interface CustomerRepository {

	Integer saveUser(User user, Connection connection) throws SQLException;
	
	void saveCustomer(Customer customer, Connection connection ) throws SQLException;
}
