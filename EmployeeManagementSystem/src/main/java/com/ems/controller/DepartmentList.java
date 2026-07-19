package com.ems.controller;

import java.io.IOException;
import java.util.List;

import com.ems.model.Department;
import com.ems.service.DepartmentService;
import com.ems.service.impl.DepartmentServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentList
 */
@WebServlet("/DepartmentList")
public class DepartmentList extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DepartmentService service = new DepartmentServiceImpl();

		List<Department> deptList = service.getAllDepartments();

		request.setAttribute("departmentList", deptList);
		request.setAttribute("showDepartmentSection", true);

		request.getRequestDispatcher("/admin/admin-dashboard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
