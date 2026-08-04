package com.oem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.oem.model.Student;
import com.oem.repository.StudentRepository;
import com.oem.repository.StudentRepositoryImpl;
import com.oem.service.StudentService;
import com.oem.service.StudentServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerStudent
 */
@WebServlet("/registerStudent")
public class registerStudent extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String fullName = request.getParameter("full_name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile_number");
		String address = request.getParameter("address");
		String dob = request.getParameter("date_of_birth");
		int subId = Integer.parseInt(request.getParameter("sub_id"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Student s = new Student();

		StudentRepository repo = new StudentRepositoryImpl();

		s.setStudentID(repo.generateStudentId());
		s.setFullName(fullName);
		s.setEmail(email);
		s.setMobileNumber(mobile);
		s.setAddress(address);
		s.setDOB(dob);
		s.setSub_id(subId);
		s.setUsername(username);
		s.setPassword(password);

		PrintWriter out = response.getWriter();

		StudentService service = new StudentServiceImpl();
		if (service.addStudent(s)) {
			request.getRequestDispatcher("StudentLogin.html").forward(request, response);
		} else {

			response.sendRedirect("StudentRegister.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
