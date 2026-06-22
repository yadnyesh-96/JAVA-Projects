package com.ems.controller;

import java.io.IOException;
import java.util.List;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.impl.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeList
 */
@WebServlet("/EmployeeList")
public class EmployeeList extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeService service = new EmployeeServiceImpl();

		List<Employee> empList = service.getAllEmployees();

		request.setAttribute("employeeList", empList);
		request.setAttribute("showEmployeeSection", true);

		request.getRequestDispatcher("/admin/admin-dashboard.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
