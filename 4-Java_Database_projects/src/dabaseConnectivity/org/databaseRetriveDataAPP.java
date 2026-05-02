package dabaseConnectivity.org;

import java.sql.*;
import java.sql.DriverManager;

public class databaseRetriveDataAPP {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
//		DriverManager.registerDriver(d);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Diver registred successfully..");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Mysql@123");
		if (conn != null) {
			System.out.println("Database Connection successfully");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT *FROM users");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
		} else {
			System.out.println("Not connected to database");
		}
	}

}
