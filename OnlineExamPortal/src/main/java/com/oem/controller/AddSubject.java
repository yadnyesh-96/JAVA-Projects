package com.oem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.oem.model.Subject;
import com.oem.service.SubjectService;
import com.oem.service.SubjectServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddSubject")
public class AddSubject extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String subject = request.getParameter("subject");
		String description = request.getParameter("description");

		Subject sub = new Subject();
		sub.setSubName(subject);
		sub.setSubDesc(description);

		SubjectService service = new SubjectServiceImpl();

		if (service.addSubject(sub)) {
			out.print("<script>alert('Subject " + sub.getSubName() + " Added Successfully');</script>");
		} else {
			out.print("<script>alert('Failed to Add Subject');</script>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
