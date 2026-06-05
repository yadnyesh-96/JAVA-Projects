package com.demo;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "pass");

			PreparedStatement stmt = conn.prepareStatement("SELECT *FROM employee  WHERE empID=?");

			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				int empId = rs.getInt("empID");
				String name = rs.getString("empName");
				String email = rs.getString("email");
				double salary = rs.getDouble("salary");

				out.println("Employee ID: " + empId + "<br>");
				out.println("Name: " + name + "<br>");
				out.println("Salary: " + salary + "<br>");
			} else {
				out.println("<h1>Employee Not Found</h1>");
			}

		} catch (Exception ex) {
			out.println(ex.getMessage());
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
