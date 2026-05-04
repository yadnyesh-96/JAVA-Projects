package dabaseConnectivity.org;

import java.util.*;
import java.sql.*;

public class databaseRetriewDataAPP {

	public static void main(String[] args) throws SQLException {
		Scanner sc =new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "pass");
		if (conn != null) {
			System.out.println("Database Connection Successfully..!");
			/*
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT *FROM users ORDER BY userId");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
			*/
			System.out.println("Enter user Details ");
			System.out.println("Enetr user name:");
			String str = sc.next();
			System.out.println("Eneter the userId :");
			int id = sc.nextInt();
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT salary FROM users WHERE userName='"+str+"' and userId="+id+"");
			if(rs.next()) {
				System.out.println("Player Found "+rs.getInt(1));
			}else {
				System.out.println("User Not found");
			}
		} else {
			System.out.println("Database is not Connected");

		}
	}

}
