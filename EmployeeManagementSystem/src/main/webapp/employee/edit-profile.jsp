<%@ page import="com.ems.model.Employee"%>

<%
Employee emp = (Employee) session.getAttribute("loggedInEmployee");

if (emp == null) {
	response.sendRedirect(request.getContextPath() + "/auth/employee-login.jsp");
	return;
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

<title>Edit Profile</title>
</head>

<body>

	<div class="container-fluid">
		<div class="row justify-content-center my-5">

			<div class="col-lg-8 border p-4 rounded-4 shadow-lg bg-light-subtle">

				<h3 class="text-center fw-bold mb-4">Update Profile</h3>

				<form action="<%=request.getContextPath()%>/UpdateEmployee"
					method="post">

					<!-- Employee ID (Readonly) -->
					<div class="mb-3">
						<label class="form-label fw-bold">Employee ID</label> <input
							type="text" class="form-control" name="employeeId"
							value="<%=emp.getEmployeeId()%>" readonly>
					</div>

					<!-- First Name & Last Name -->
					<div class="row mb-3">

						<div class="col-md-6">
							<label class="form-label fw-bold">First Name</label> <input
								type="text" class="form-control" name="firstName"
								value="<%=emp.getFirstName()%>">
						</div>

						<div class="col-md-6">
							<label class="form-label fw-bold">Last Name</label> <input
								type="text" class="form-control" name="lastName"
								value="<%=emp.getLastName()%>">
						</div>

					</div>

					<!-- Username & Email -->
					<div class="row mb-3">

						<div class="col-md-6">
							<label class="form-label fw-bold">Username</label> <input
								type="text" class="form-control" name="username"
								value="<%=emp.getUsername()%>">
						</div>

						<div class="col-md-6">
							<label class="form-label fw-bold">Email</label> <input
								type="email" class="form-control" name="email"
								value="<%=emp.getEmail()%>">
						</div>

					</div>

					<!-- Mobile & Password -->
					<div class="row mb-3">

						<div class="col-md-6">
							<label class="form-label fw-bold">Mobile</label> <input
								type="text" class="form-control" name="mobile"
								value="<%=emp.getMobile()%>">
						</div>

						<div class="col-md-6">
							<label class="form-label fw-bold">Password</label> <input
								type="password" class="form-control" name="password"
								value="<%=emp.getPassword()%>">
						</div>

					</div>

					<!-- Gender -->
					<div class="mb-3">

						<label class="form-label fw-bold"> Gender </label>

						<div>

							<input type="radio" name="gender" value="Male"
								<%="Male".equals(emp.getGender()) ? "checked" : ""%>>

							Male <input type="radio" name="gender" value="Female"
								class="ms-3"
								<%="Female".equals(emp.getGender()) ? "checked" : ""%>>

							Female <input type="radio" name="gender" value="Other"
								class="ms-3"
								<%="Other".equals(emp.getGender()) ? "checked" : ""%>>

							Other

						</div>

					</div>

					<!-- Department & Joining Date (Readonly) -->
					<div class="row mb-4">

						<div class="col-md-6">
							<label class="form-label fw-bold"> Department ID </label> <input
								type="text" class="form-control"
								value="<%=emp.getDepartmentId()%>" readonly>
						</div>

						<div class="col-md-6">
							<label class="form-label fw-bold"> Joining Date </label> <input
								type="text" class="form-control"
								value="<%=emp.getJoiningDate()%>" readonly>
						</div>

					</div>

					<div class="d-flex gap-3">

						<button type="submit" class="btn btn-warning flex-fill fw-bold">

							Update Profile</button>

						<a href="<%=request.getContextPath()%>/employee/profile.jsp"
							class="btn btn-secondary flex-fill"> Cancel </a>

					</div>

				</form>

			</div>

		</div>
	</div>

</body>
</html>