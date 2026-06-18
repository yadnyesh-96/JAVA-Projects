package com.ems.service.impl;

import com.ems.model.Admin;
import com.ems.repository.AdminRepository;
import com.ems.repository.impl.AdminRepositoryImpl;
import com.ems.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminRepository repository = new AdminRepositoryImpl();

	@Override
	public Admin loginadminLogin(String username, String password) {

		if (username == null || username.trim().isEmpty()) {
			return null;
		}

		if (password == null || password.trim().isEmpty()) {
			return null;
		}

		return repository.adminLogin(username, password);

	}

}
