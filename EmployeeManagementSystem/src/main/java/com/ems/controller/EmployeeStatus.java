package com.ems.controller;

import java.io.IOException;

import com.ems.model.GetEmployeeStatusCount;
import com.ems.service.EmployeeService;
import com.ems.service.impl.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeStatus
 */
@WebServlet("/EmployeeStatus")
public class EmployeeStatus extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeService service = new EmployeeServiceImpl();

		GetEmployeeStatusCount count = service.getEmployeeStatusCounts();

		System.out.println(count);

		request.setAttribute("activeCount", count.getActiveCount());
		request.setAttribute("inactiveCount", count.getInactiveCount());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
