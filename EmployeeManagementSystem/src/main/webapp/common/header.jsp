<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Employee Database Management System</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

		<div class="container">

			<a class="navbar-brand" href="#"> EDMS </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav">

				<span class="navbar-toggler-icon"></span>

			</button>

			<div class="collapse navbar-collapse" id="navbarNav">

				<ul class="navbar-nav ms-auto">

					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/index.jsp"> Home </a></li>

					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/auth/employee-login.jsp">
							Employee Login </a></li>

					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/auth/admin-login.jsp">
							Admin Login </a></li>

					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/auth/employee-register.jsp">
							Register </a></li>

				</ul>

			</div>

		</div>

	</nav>

	<div class="container mt-4">