package com.oem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.oem.model.Question;
import com.oem.service.QuestionService;
import com.oem.service.QuestionServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddQuestion
 */
@WebServlet("/AddQuestion")
public class AddQuestion extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		int subId = Integer.parseInt(request.getParameter("subId"));
		String question = request.getParameter("question");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String option3 = request.getParameter("option3");
		String option4 = request.getParameter("option4");
		String answer = request.getParameter("answer");

		Question que = new Question();

		que.setSubId(subId);
		que.setQuestion(question);
		que.setOption1(option1);
		que.setOption2(option2);
		que.setOption3(option3);
		que.setOption4(option4);
		que.setAnswer(answer);

		QuestionService service = new QuestionServiceImpl();

		if (service.addQUestion(que)) {
			
			out.print("<script>alert('Question Added Successfully');</script>");
			request.getRequestDispatcher("viewSubjectQuestions.html").forward(request, response);
			
		} else {
			out.print("<script>alert('Failed to Add Question');</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
