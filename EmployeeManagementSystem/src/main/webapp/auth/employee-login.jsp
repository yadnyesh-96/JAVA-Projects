
<%
String success = (String) request.getAttribute("success");

if (success != null) {
%>

<div class="alert alert-success">
	<%=success%>
</div>

<%
}
%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
<title>Employee_login</title>
</head>

<body>
	<div
		class="container vh-100 d-flex justify-content-center align-items-center">
		<div class="card p-5 shadow" style="width: 350px;">
			<h3 class="text-center mb-4">Login</h3>


			<form action="<%=request.getContextPath()%>/EmployeeLogin"
				method="post">
				<div class="mb-4">
					<label class="form-label">Username / Email</label> <input
						class="form-control" type="usernameOrEmail" name="usernameOrEmail"
						id="" placeholder="email or username">
				</div>

				<div class="mb-4">
					<label class="form-label">Password</label> <input
						class="form-control" type="password" name="password" id=""
						placeholder="password">
				</div>

				<button class="btn btn-primary w-100 mb-4">Login</button>

				<p class="text-center">
					Don't have an account?<br> <a
						href="employee-register.jsp"> Register Here </a>
				</p>
			</form>
		</div>
	</div>
</body>

</html>