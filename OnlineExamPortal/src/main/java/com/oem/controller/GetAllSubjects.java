package com.oem.controller;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.oem.model.Subject;
import com.oem.service.SubjectService;
import com.oem.service.SubjectServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAllSubjects
 */
@WebServlet("/GetAllSubjects")
public class GetAllSubjects extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SubjectService service = new SubjectServiceImpl();

		List<Subject> sub = service.getAllSubjects();

		Gson gson = new Gson();

		String json = gson.toJson(sub);

		response.setContentType("application/json");

		response.getWriter().print(json);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
