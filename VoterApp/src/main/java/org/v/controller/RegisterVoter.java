package org.v.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.v.model.Candidate;
import org.v.service.VoterService;
import org.v.service.VoterServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterVoter
 */
@WebServlet("/RegisterVoter")
public class RegisterVoter extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String district = request.getParameter("district");
		String state = request.getParameter("state");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Candidate c = new Candidate();
		c.setName(name);
		c.setDistrict(district);
		c.setState(state);
		c.setAge(age);
		c.setEmail(email);
		c.setPassword(password);

		VoterService service = new VoterServiceImpl();

		if (service.registerVoter(c)) {

			out.print("<h>Candidate Registered Successfully</h1>");
		} else {
			out.print("<h1>Candidate Not Registered</h1>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
