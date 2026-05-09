package dabaseConnectivity.org;

import java.util.*;
import java.sql.*;
import java.io.*;
import java.util.Properties;

public class ReadCSVfileAPP {
	public static void main(String[] args) throws Exception {
		
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		File f = new File("");
		FileInputStream fin = new FileInputStream(f.getAbsoluteFile()+"\\src\\dabaseConnectivity\\org\\config.properties");
		Properties p = new Properties();
		p.load(fin);
		String username = p.getProperty("uname");
		String password = p.getProperty("pass");
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "pass");

		if (conn != null) {
			System.out.println("Database Connection Successfull...");
		} else {
			System.out.println("Databse Connection Failed");
		}
	}

}
