package com.esm.utility;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		
		if(conn != null) {
			System.out.println("Connection Success");
		}else {
			System.out.println("Connection Failed");
		}
	}

}
