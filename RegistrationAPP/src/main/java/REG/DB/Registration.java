package REG.DB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String firstName = request.getParameter("first");
		String lastName = request.getParameter("last");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_db", "root", "pass");

			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO users VALUES(0,?,?,?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, email);
			pstmt.setString(4, username);
			pstmt.setString(5, password);

			int value = pstmt.executeUpdate();
			if (value > 0) {

				out.println("<h1>User registration Success...</h1><br><br>");
				out.print("<h1>" + firstName + "<br> " + lastName + "<br>" + email + "<br>" + username + "<br>"
						+ password + "</h1>");
			}

		} catch (Exception ex) {
			out.print("Error iS :" + ex);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
