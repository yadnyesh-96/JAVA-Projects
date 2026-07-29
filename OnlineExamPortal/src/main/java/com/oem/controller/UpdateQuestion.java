package com.oem.controller;

import java.io.IOException;

import com.oem.model.Question;
import com.oem.service.QuestionService;
import com.oem.service.QuestionServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateQuestion
 */
@WebServlet("/UpdateQuestion")
public class UpdateQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("updateQuestion.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Question q = new Question();

		q.setQueId(Integer.parseInt(request.getParameter("queId")));
		q.setSubId(Integer.parseInt(request.getParameter("subject")));
		q.setQuestion(request.getParameter("question"));
		q.setOption1(request.getParameter("option1"));
		q.setOption2(request.getParameter("option2"));
		q.setOption3(request.getParameter("option3"));
		q.setOption4(request.getParameter("option4"));
		q.setAnswer(request.getParameter("answer"));

		QuestionService service = new QuestionServiceImpl();

		if (service.updateQuestion(q)) {
			response.sendRedirect("viewSubjectQuestions.html?msg=updated");
		} else {
			response.sendRedirect("UpdateQuestion?queId=" + q.getQueId() + "&msg=failed");
		}
	}

}
