package REG.DB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();

		try {
			com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_db", "root", "pass");

			PreparedStatement pstmt = conn.prepareStatement("SELECT *FROM users WHERE username=? AND password=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
//				out.println("<h1>Login Success ...</h1>");
				
				HttpSession session = request.getSession();
				
				
				RequestDispatcher r = request.getRequestDispatcher("Profile.html");
				r.forward(request, response);
			} else {
				out.println("<script>alert('User Not Found. Please register first');</script>");
				
				RequestDispatcher r = request.getRequestDispatcher("Registration.html");
				r.include(request, response);
			}

		} catch (Exception e) {
			out.println("<h1>" + e + "</h1>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
