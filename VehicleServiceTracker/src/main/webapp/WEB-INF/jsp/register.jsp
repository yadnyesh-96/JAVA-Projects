<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Customer Registration | Vehicle Service Tracker</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/variables.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/register.css">

</head>
<body>

	<div class="container mt-5">
		<div class="card shadow">
			<div class="card-header bg-primary text-white">
				<h3 class="mb-0">Registration Form</h3>
			</div>

			<div class="card-body">

				<form action="${pageContext.request.contextPath}/register"
					method="post" enctype="multipart/form-data">

					<div class="row">

						<!-- username -->
						<div class="col-md-6 mb-3">
							<label for="username" class="form-label">Username <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" name="username" id="username"
								placeholder="Enter Username">
						</div>

						<!-- email -->
						<div class="col-md-6 mb-3">
							<label for="email" class="form-label">Email <span
								class="text-danger">*</span></label> <input type="email"
								class="form-control" name="email" id="email"
								placeholder="Enter Email">
						</div>
					</div>

					<div class="row">
						<!-- mobile -->
						<div class="col-md-6 mb-3">
							<label for="mobile" class="form-label">Mobile <span
								class="text-danger">*</span></label> <input type="tel"
								class="form-control" name="mobile" id="mobile"
								placeholder="Enter Mobile Number" maxlength="10">
						</div>

						<!-- password -->
						<div class="col-md-6 mb-3">
							<label for="password" class="form-label">Password <span
								class="text-danger">*</span></label> <input type="password"
								class="form-control" name="password" id="password"
								placeholder="Enter Password">
						</div>
					</div>

					<div class="row">
						<!-- confirm password -->
						<div class="col-md-6 mb-3">
							<label for="confirmPassword" class="form-label">Confirm
								Password</label> <input type="password" class="form-control"
								name="confirmPassword" id="confirmPassword"
								placeholder="Confirm Password">
						</div>

						<!-- first name -->
						<div class="col-md-6 mb-3">
							<label for="firstName" class="form-label">First Name <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" name="firstName" id="firstName"
								placeholder="Enter First Name">
						</div>
					</div>

					<div class="row">
						<!-- last name -->
						<div class="col-md-6 mb-3">
							<label class="form-label">Last Name <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" name="lastName" id=""
								placeholder="Enter Last Name">
						</div>

						<!-- Profile Image -->
						<div class="col-md-6 mb-3">
							<label class="form-label">Profile Image</label> <input
								type="file" class="form-control" name="profile_image"
								accept="image/*">
						</div>

					</div>

					<div class="row">
						<!-- Address Line 1 -->
						<div class="col-md-6 mb-3">
							<label class="form-label">Address Line 1 <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" name="addressLine1"
								placeholder="Enter Address Line 1">
						</div>

						<!-- Address Line 2 -->
						<div class="col-md-6 mb-3">
							<label class="form-label">Address Line 2</label> <input
								type="text" class="form-control" name="addressLine2"
								placeholder="Enter Address Line 2">
						</div>
					</div>

					<div class="row">
						<!-- city -->
						<div class="col-md-6 mb-3">
							<label class="form-label">City <span class="text-danger">*</span></label>
							<input type="text" class="form-control" name="city" id=""
								placeholder="Enter City">
						</div>

						<!-- state  -->
						<div class="col-md-6 mb-3">
							<label class="form-label">State <span class="text-danger">*</span></label>
							<input type="text" class="form-control" name="state" id=""
								placeholder="Enter State">
						</div>

					</div>

					<div class="row">

						<!-- PIN code -->
						<div class="col-md-6 mb-3">
							<label class="form-label">PIN Code <span
								class="text-danger">*</span></label> <input type="text"
								class="form-control" name="pincode" id=""
								placeholder="Enter PIN code">
						</div>

						<!-- gender -->
						<div class="col-md-6 mb-3">
							<label class="form-label">Gender <span
								class="text-danger">*</span></label> <select class="form-select"
								name="gender" id="">
								<option selected disabled>Select Gender</option>
								<option value="MALE">Male</option>
								<option value="FEMALE">Female</option>
								<option value="OTHER">other</option>
							</select>
						</div>

					</div>

					<button type="submit" class="btn btn-primary w-100">Register</button>
				</form>
			</div>
		</div>
	</div>

</body>

</html>