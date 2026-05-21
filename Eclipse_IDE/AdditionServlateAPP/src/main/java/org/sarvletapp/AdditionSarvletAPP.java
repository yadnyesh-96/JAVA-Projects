package org.sarvletapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AdditionSarvletAPP
 */
@WebServlet("/AdditionSarvletAPP")
public class AdditionSarvletAPP extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("First");
		String s2 = request.getParameter("second");
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int sum = a+b;
		out.print("Addition is: "+sum);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
