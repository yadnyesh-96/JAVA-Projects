package com.esm.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/edms_db", "root", "pass");
			System.out.println("Database Connected Successfully...");

		} catch (Exception ex) {
			System.out.println("Database Connection Failed...");

			ex.printStackTrace();
		}

		return conn;
	}

}
