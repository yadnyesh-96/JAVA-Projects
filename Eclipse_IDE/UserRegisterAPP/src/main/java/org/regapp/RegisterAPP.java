package org.regapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RegisterAPP
 */
@WebServlet("/signIn")
public class RegisterAPP extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello Developers ... </h1>");
		/*
		try {
			com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarvlet_db","root","pass");
			if(conn!=null) {
				out.println("<h1>Database connection Success...</h1>");
			}else {
				out.println("<h1>failed to Database connection ...!</h1>");
			}
			
		}catch(Exception ex) {
			out.println("<h1>Exception Error is :"+ex+"</h1>");
		}
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
