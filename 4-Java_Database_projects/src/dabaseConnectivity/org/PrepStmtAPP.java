package dabaseConnectivity.org;

import java.sql.*;
import java.util.*;

public class PrepStmtAPP {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered..");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "pass");
		if (conn != null) {
			System.out.println("Database Connected..");
			System.out.println("Enter the user Details");
	
			System.out.println("Enter userId:");
			int id = sc.nextInt();
			System.out.println("Enter userName:");
			String name = sc.next();
			
			System.out.println("Enter the Salary:");
//			nextLine();
			int salary = sc.nextInt();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO users VALUES(?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, salary);
			int value = stmt.executeUpdate();
			if(value>0) {
				System.out.println("Data inserted into database");
			}else {
				System.out.println("Data is not inserted into database ");
			}
		} else {
			System.out.println("Database Connection get failed..!");
		}

	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
