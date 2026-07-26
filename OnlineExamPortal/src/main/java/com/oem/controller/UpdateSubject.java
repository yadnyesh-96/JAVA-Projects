package com.oem.controller;

import java.io.IOException;

import com.oem.model.Subject;
import com.oem.service.SubjectService;
import com.oem.service.SubjectServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateSubject
 */
@WebServlet("/UpdateSubject")
public class UpdateSubject extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		int subId = Integer.parseInt(request.getParameter("subId"));

		Subject sub = new Subject();
		sub.setSubId(subId);

		SubjectService service = new SubjectServiceImpl();

		Subject subject = service.getSubject(sub);
		request.setAttribute("subject", subject);
		request.getRequestDispatcher("updateSubject.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int subId = Integer.parseInt(request.getParameter("subId"));
		String subName = request.getParameter("subject");
		String subDesc = request.getParameter("description");

		Subject subject = new Subject();

		subject.setSubId(subId);
		subject.setSubName(subName);
		subject.setSubDesc(subDesc);

		SubjectService service = new SubjectServiceImpl();

		if (service.updateSubject(subject)) {
			response.sendRedirect("subjectTable.html?msg=success");
		} else {
			response.sendRedirect("updateSubject.jsp?msg=failed");
		}
	}

}
