package com.oem.test;

import java.sql.Connection;

import com.oem.utility.DBConnection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection conn = DBConnection.getConnection();
			if (conn != null) {
				System.out.println("Connection Successfull");
			} else {
				System.out.println("Connection Failed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
