package dabaseConnectivity.org;

import java.sql.*;
import java.util.*;

public class PrepStatDelAPP {
	public static void main(String x[]) throws SQLException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
	
		if (conn != null) {
			System.out.println("Database Connection successfully...");
			System.out.println("Enter userId to delete");
			int id = sc.nextInt();
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM users WHERE userId=?");
			stmt.setInt(1, id);
			int value = stmt.executeUpdate();
			if (value > 0) {
				System.out.println("Record updated...");
			} else {
				System.out.println("Record is not updated");
			}
		} else {
			System.out.println("Connection Failed !");
		}
	}
}
