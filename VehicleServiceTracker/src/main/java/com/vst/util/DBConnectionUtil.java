package com.vst.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectionUtil {

	// Database Configuration

	/*
	 * public static final String
	 * URL="jdbc:mysql://localhost:3306/vehicle_service_db"; public static final
	 * String username = "root"; public static final String password = "pass";
	 */

	private static String url;
	private static String username;
	private static String password;

	static {
		try (InputStream input = DBConnectionUtil.class.getClassLoader().getResourceAsStream("database.properties")) {

			Properties properties = new Properties();
			properties.load(input);

			url = properties.getProperty("db.url");
			username = properties.getProperty("db.username");
			password = properties.getProperty("db.password");

		} catch (Exception e) {
			throw new RuntimeException("Unable to load database.properties", e);
		}
	}

	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(url, username, password);
	}

}
