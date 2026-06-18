package com.ems.controller;

import java.io.IOException;

import com.ems.model.Admin;
import com.ems.service.AdminService;
import com.ems.service.impl.AdminServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		AdminService ser = new AdminServiceImpl();

		Admin adm = ser.loginadminLogin(username, password);


		if (adm != null) {
			

			HttpSession session = request.getSession();

			session.setAttribute("loggedInAdmin", adm);

			response.sendRedirect(request.getContextPath() + "/admin/admin-dashboard.jsp");

		} else {

			request.setAttribute("Error", "Invalid Username or Password");

			request.getRequestDispatcher("/admin/admin-login.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
