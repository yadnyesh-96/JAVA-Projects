package com.ems.controller;

import java.io.IOException;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.impl.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String usernameOremail = request.getParameter("usernameOrEmail");
		String password = request.getParameter("password");

		EmployeeService serv = new EmployeeServiceImpl();

		Employee emp = serv.login(usernameOremail, password);

		if (emp != null) {

			HttpSession session = request.getSession();

			session.setAttribute("success", "Login successful");

			session.setAttribute("loggedInEmployee", emp);

			response.sendRedirect(request.getContextPath() + "/employee/dashboard.jsp");

		} else {

			request.setAttribute("error", "Invalid Username/email or password");

			request.getRequestDispatcher("/auth/employee-login.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
