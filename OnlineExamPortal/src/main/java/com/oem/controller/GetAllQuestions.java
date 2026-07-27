package com.oem.controller;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.oem.model.Question;
import com.oem.service.QuestionService;
import com.oem.service.QuestionServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAllQuestions
 */
@WebServlet("/GetAllQuestions")
public class GetAllQuestions extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int subId = Integer.parseInt(request.getParameter("subId"));

		QuestionService service = new QuestionServiceImpl();

		Question que = new Question();

		List<Question> list = service.getAllQuestion(subId);

		Gson gson = new Gson();

		response.setContentType("application/json");

		response.getWriter().write(gson.toJson(list));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
