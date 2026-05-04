package dabaseConnectivity.org;

import java.util.*;
import java.sql.*;

public class CollabaleInterAPP {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "pass");
		if (conn != null) {
			System.out.println("Database Connection Successfull...");
			/*
			 * CallableStatement stmt = conn.prepareCall("{call saveUser(?,?,?)}");
			 * stmt.setInt(1, 6); stmt.setString(2, "Vaibhav"); stmt.setInt(3, 45250);
			 * boolean b = stmt.execute(); if (!b) {
			 * System.out.println("Procedure executed"); } else {
			 * System.out.println("Procedure not executed"); }
			 */
			CallableStatement stmt = conn.prepareCall("{call getUser(?,?)}");
			stmt.setInt(1, 6);
			stmt.registerOutParameter(2, Types.VARCHAR);
			boolean b = stmt.execute();
			if (!b) {
				System.out.println("Procedure Executed user Name:" + stmt.getString(2));
			} else {
				System.out.println("Procedure in not executed");
			}
		} else {
			System.out.println("Connection Failed...!");
		}
	}

}
