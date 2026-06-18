<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.ems.model.Admin"%>

<%
Admin adm = (Admin) session.getAttribute("loggedInAdmin");

if (adm == null) {
	response.sendRedirect(request.getContextPath() + "/auth/admin-login.jsp");
	return;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin-dashboard</title>
</head>
<body>
	<h2>
		Welcome Admin,
		<%=adm.getUsername()%>
	</h2>
</body>
</html>