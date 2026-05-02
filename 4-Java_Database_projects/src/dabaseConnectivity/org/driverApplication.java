package dabaseConnectivity.org;

import java.sql.DriverManager;
import java.sql.*;

public class driverApplication {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Successfully...");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Mysql@123");
		if(con!=null) {
			System.out.println("Database Connection Successfully...");
			Statement stmt = con.createStatement();
			int value = stmt.executeUpdate("INSERT INTO users VALUES(3,'Umesh',22450)");
			if(value>0) {
				System.out.println("Record Stored..");
			}else {
				System.out.println("Record is not stored..!");
			}
		}else {
			System.out.println("Database Connection Failed..!");
		}
	}

}
