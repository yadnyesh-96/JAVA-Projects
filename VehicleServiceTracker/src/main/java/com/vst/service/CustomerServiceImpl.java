package com.vst.service;

import java.sql.Connection;

import com.vst.model.Customer;
import com.vst.model.User;
import com.vst.repository.CustomerRepository;
import com.vst.repository.CustomerRepositoryImpl;
import com.vst.util.DBConnectionUtil;
import com.vst.util.PasswordUtil;

public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository = new CustomerRepositoryImpl();

	@Override
	public void registerCustomer(User user, Customer customer) {

		Connection conn = null;

		try {

			conn = DBConnectionUtil.getConnection();

			conn.setAutoCommit(false);

			String hashedPassword = PasswordUtil.hashPassword(user.getPasswordHash());
			user.setPasswordHash(hashedPassword);
			
			Integer userId = customerRepository.saveUser(user, conn);

			customer.setUserId(userId);
			customerRepository.saveCustomer(customer, conn);

			conn.commit();

		} catch (Exception e) {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception c) {
					c.printStackTrace();
				}
			}
		}
	}

}
