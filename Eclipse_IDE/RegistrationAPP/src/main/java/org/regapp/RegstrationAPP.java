package org.regapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegstrationAPP
 */
@WebServlet("/RegstrationAPP")
public class RegstrationAPP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int id  = Integer.parseInt(request.getParameter("id"));
		int sal = Integer.parseInt(request.getParameter("sal"));
		String username = request.getParameter("name");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","pass");
			if(conn!=null) {
				out.println("<h1>Connection Successfull ...</h1>");
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO users VALUES (?,?,?)");
				pstmt.setInt(1,id);
				pstmt.setString(2,username);
				pstmt.setInt(3,sal);
				
				int value = pstmt.executeUpdate();
				if(value>0) {
					out.println("<h1>User Registration Successfull ...</h1>");
				}else {
					out.println("<h1>Registration Failed ...!</h1>");
				}
			}else {
				out.println("<h1>Connection Failed...!</h1>");
			}

		} catch (Exception e) {
			out.println("<h1>Errors is : " + e + "</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
