package com.oem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.oem.service.StudentService;
import com.oem.service.StudentServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentLogin
 */
@WebServlet("/StudentLogin")
public class StudentLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		StudentService service = new StudentServiceImpl();

		PrintWriter out = response.getWriter();
		
		if (service.studentLogin(login, password)) {

			out.print("<h1>Student Dashboard</h1>");
			out.print("<h1>" + login + "</h1>");
			out.print("<h1>" + password + "</h1>");

		} else {
			out.print("<h1> Login Failed</h1>");
			out.print("<a href='StudentRegister.html'>Register</a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
