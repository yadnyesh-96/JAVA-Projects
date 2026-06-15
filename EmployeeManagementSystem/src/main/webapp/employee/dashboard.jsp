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
<title>employee-<%=emp.getEmployeeId()%></title>
</head>

<body>
	<div
		class="container vh-100 d-flex align-items-center justify-content-center">
		<div
			style="background-color: rgba(179, 196, 248, 0.234); border: none;"
			class="card p-5">

			<div class="card p-2 shadow-lg" style="background-color: aliceblue;">
				<h2 class="fw-bold mt-2 mx-5 mb-3">
					Welcome,
					<%=emp.getFirstName()%></h2>
				<div class="justify-content-center">
					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2 ">
						Name : <span style="color: black;"><%=emp.getFirstName()%>
							<%=emp.getLastName()%> </span>
					</h5>
					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2">
						Employee ID : <span style="color: black;"><%=emp.getEmployeeId()%></span>
					</h5>

					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2">
						Username : <span style="color: black;"><%=emp.getUsername()%>
						</span>
					</h5>

					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2">
						Email ID: <span style="color: black;"><%=emp.getEmail()%></span>
					</h5>

					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2">
						Mobile : <span style="color: black;"><%=emp.getMobile()%></span>
					</h5>

					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2">
						Gender : <span style="color: black;"><%=emp.getGender()%></span>
					</h5>

					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2">
						Department : <span style="color: black;"><%=emp.getDepartmentId()%></span>
					</h5>

					<h5 style="color: rgb(55, 109, 209);"
						class="text-start fw-bold fs-6 mb-2">
						Joining Date : <span style="color: black;"><%=emp.getJoiningDate()%></span>
					</h5>

					<div class="d-flex justify-content-center gap-4 my-3">
						<a style="background-color: rgb(3, 98, 38); color: white;"
							class="btn border flex-fill fw-bold">View Profile </a>
						<button class="btn border fw-bold bg-warning flex-fill">Update
							Profile</button>

						<a href="<%=request.getContextPath()%>/Logout"
							style="color: white;"
							class="btn border fw-bold bg-danger flex-fill">Logout </a>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>

</html>