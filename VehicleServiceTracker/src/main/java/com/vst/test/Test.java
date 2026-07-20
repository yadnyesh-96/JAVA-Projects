package com.vst.test;

import java.sql.Connection;

import com.vst.util.DBConnectionUtil;

public class Test {
	public static void main(String x[]) throws Exception {
		
		Connection conn = DBConnectionUtil.getConnection();
		
		if(conn!=null) {
			System.out.println("Connection Success");
		}else {
			System.out.println("Connection failed");
		}
	}
}
