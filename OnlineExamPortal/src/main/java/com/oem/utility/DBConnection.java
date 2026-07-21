package com.oem.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static String url = "jdbc:mysql://localhost:3306/online_exam_db";
	private static String username = "root";
	private static String password = "pass";

	public static Connection getConnection() throws Exception {

		return DriverManager.getConnection(url, username, password);
	}
}
