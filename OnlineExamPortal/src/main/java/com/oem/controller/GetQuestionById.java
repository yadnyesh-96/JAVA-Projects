package com.oem.controller;

import java.io.IOException;

import com.google.gson.Gson;
import com.oem.model.Question;
import com.oem.service.QuestionService;
import com.oem.service.QuestionServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/GetQuestionById")
public class GetQuestionById extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int queId = Integer.parseInt(request.getParameter("queId"));

		QuestionService service = new QuestionServiceImpl();

		Question que = service.getQuestionById(queId);

		response.setContentType("application/JSON");

		Gson gson = new Gson();

		response.getWriter().write(gson.toJson(que));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
