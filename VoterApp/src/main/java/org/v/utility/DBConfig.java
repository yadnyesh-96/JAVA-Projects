package org.v.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {

	public static Connection getConnection() {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/org_voter_db", "root", "pass");
			System.out.println("Connection Success..");

		} catch (Exception e) {

			System.out.println("Database Connection Failed...");
			e.printStackTrace();

		}
		return conn;
	}
}
