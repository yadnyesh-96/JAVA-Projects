package com.oem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.oem.service.SubjectService;
import com.oem.service.SubjectServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteSubject
 */
@WebServlet("/deleteSubject")
public class deleteSubject extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		int subId = Integer.parseInt(request.getParameter("subId"));

		SubjectService service = new SubjectServiceImpl();

		if (service.deleteSubject(subId)) {

			response.sendRedirect("subjectTable.html?msg=deleted");

		} else {

			response.sendRedirect("subjectTable.html?msg=failed	");

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
