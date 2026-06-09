package com.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.impl.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeRegistration
 */
@WebServlet("/EmployeeRegistration")
public class EmployeeRegistration extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String joiningDate = request.getParameter("joiningDate");
		int departmentId = Integer.parseInt(request.getParameter("departmentId"));

		Employee emp = new Employee();

		emp.setUsername(username);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setMobile(mobile);
		emp.setPassword(password);
		emp.setGender(gender);
		emp.setJoiningDate(joiningDate);
		emp.setDepartmentId(departmentId);

		EmployeeService service = new EmployeeServiceImpl();

		PrintWriter out = response.getWriter();

		if (service.registerEmployee(emp)) {
			out.print("Registration Successful");

			request.setAttribute("Success", "Registration Successful");

			request.getRequestDispatcher("/auth/employee-login.jsp").forward(request, response);

		} else {

			out.print("Registration Fails");

			request.setAttribute("Failed", "Registration FAild");
			request.getRequestDispatcher("/auth/employee-register.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
