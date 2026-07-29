package com.oem.controller;

import java.io.IOException;

import com.oem.service.QuestionService;
import com.oem.service.QuestionServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteQuestion
 */
@WebServlet("/deleteQuestion")
public class deleteQuestion extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		int queId = Integer.parseInt(request.getParameter("queId"));

		QuestionService service = new QuestionServiceImpl();

		if (service.deleteQuestion(queId)) {

			response.sendRedirect("viewSubjectQuestions.html?msg=deleted");

		} else {

			response.sendRedirect("viewSubjectQuestions.html?msg=failed	");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
