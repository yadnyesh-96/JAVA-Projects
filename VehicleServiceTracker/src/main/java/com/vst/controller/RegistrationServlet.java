package com.vst.controller;

import java.io.IOException;

import com.vst.model.Customer;
import com.vst.model.User;
import com.vst.service.CustomerService;
import com.vst.service.CustomerServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ===== Read User Details =====
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");

		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");

		// ===== Read Customer Details =====
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		String addressLine1 = request.getParameter("addressLine1");
		String addressLine2 = request.getParameter("addressLine2");

		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String pincode = request.getParameter("pincode");

		String gender = request.getParameter("gender");

		// ===== Create User Object =====
		User user = new User();

		user.setUsername(username);
		user.setEmail(email);
		user.setMobileNumber(mobile);

		// Password will be encrypted in Service Layer
		user.setPasswordHash(password);
		
		 // ===== Create Customer Object =====
		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setAddressLine1(addressLine1);
		customer.setAddressLine2(addressLine2);
		
		customer.setCity(city);
		customer.setState(state);
		customer.setPincode(pincode);
		
		CustomerService service =new CustomerServiceImpl();
		
		if(service.registerCustomer(user, customer)) {
			
		}
		
	}

}
