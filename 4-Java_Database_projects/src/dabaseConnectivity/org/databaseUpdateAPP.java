package dabaseConnectivity.org;

import java.sql.*;

public class databaseUpdateAPP {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver is registered");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Mysql@123");
		if (conn != null) {
			System.out.println("Database connected Successfully...");
			Statement stmt = conn.createStatement();
			int value = stmt.executeUpdate("UPDATE users SET salary='21500' WHERE userId=2");
			if(value>0) {
				System.out.println("Database Updated Successfully..");
			}else {
				System.out.println("database not be able to updated");
			}

		} else {
			System.out.println("Not be able to Connected ");
		}
	}

}
