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
import jakarta.servlet.http.HttpSession;

@WebServlet("/UpdateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String employeeId = request.getParameter("employeeId");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");

		Employee emp = new Employee();

		emp.setEmployeeId(employeeId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setUsername(username);
		emp.setEmail(email);
		emp.setMobile(mobile);
		emp.setPassword(password);
		emp.setGender(gender);

		EmployeeService service = new EmployeeServiceImpl();
		if (service.updateEmployee(emp)) {

			Employee updatedEmp = service.getEmployeeByEmployeeId(employeeId);

			HttpSession session = request.getSession();

			session.setAttribute("loggedInEmployee", updatedEmp);

			session.setAttribute("success", "Profile Updated Successfully");

			response.sendRedirect(request.getContextPath() + "/employee/profile.jsp");
		} else {

			request.setAttribute("failed", "Profile update failed");

			request.getRequestDispatcher("/employee/edit-profile.jsp").forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect(request.getContextPath() + "/employee/profile.jsp");

	}

}
