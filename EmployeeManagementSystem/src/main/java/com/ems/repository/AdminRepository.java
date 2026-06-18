package com.ems.repository;

import com.ems.model.Admin;

public interface AdminRepository {
	
	Admin adminLogin(String username, String password);
}
