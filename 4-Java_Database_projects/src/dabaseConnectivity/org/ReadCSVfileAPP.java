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
			
			FileReader fr = new FileReader("D:\\Desk\\Giri's\\JAVA Projects\\UserDetails.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			boolean flag = false;
			while((line=br.readLine())!=null) {
				String cols[]= line.split(",");
				PreparedStatement stmt = conn.prepareStatement("INSERT INTO users VALUES(?,?,?)");
				stmt.setInt(1,Integer.parseInt(cols[0]));
				stmt.setString(2,cols[1]);
				stmt.setInt(3,Integer.parseInt(cols[2]));
				int value = stmt.executeUpdate();
				
			}
		} else {
			System.out.println("Databse Connection Failed");
		}
	}

}
