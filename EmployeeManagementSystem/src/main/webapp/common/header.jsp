<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>navbar</title>
<style>
.dropdown-item:hover {
	background-color: rgba(142, 139, 139, 0.625);
	color: rgb(0, 0, 0);
}

footer a:hover {
	color: #0d6efd !important;
	transition: 0.3s;
}
</style>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark py-3">
		<div class="container-fluid">
			<a class="navbar-brand fw-bold fs-1 px-5" href="#"><span
				style="color: yellow;">E</span>DMS</a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav ms-auto fs-5 fw-semibold">
					<li class="nav-item me-4"><a class="nav-link active" href="#">Home</a>
					</li>
					<li class="nav-item me-4"><a class="nav-link" href="#">Features</a>
					</li>
					<li class="nav-item me-4"><a class="nav-link" href="#">Pricing</a>
					</li>
					<li class="nav-item dropdown pe-5"><a
						class="nav-link dropdown-toggle " href="#" role="button"
						data-bs-toggle="dropdown"> Login/Register </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item fw-semibold" href="#">Employee
									Registration</a></li>
							<li><a class="dropdown-item fw-semibold" href="#">Employee
									Login</a></li>
							<li><a class="dropdown-item fw-semibold" href="#">Admin
									Login</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>