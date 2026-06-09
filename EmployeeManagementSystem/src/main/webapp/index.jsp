<jsp:include page="/common/header.jsp" />
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
<title>home</title>
<style>
</style>
</head>

<body>
	<div class="container-fluid p-4 mb-5">
		<div class="row align-items-center">
			<div class="col-md-6 p-5">
				<h2 class="mb-4" style="font-size: 3rem; font-weight: 700;">
					Employee Database <br>Management System
				</h2>
				<p class="fs-5" style="font-weight: 400;">
					Manage your employees easily and efficiently<br> A simple and
					smart solution for organization.
				</p>
			</div>
			<div class="col-md-6 text-center">
				<img src="./bg-image.png" class="img-fluid w-75" alt="computer">
			</div>
		</div>
	</div>


	<!-- card area  -->

	<div class="container-fluid p-4 mb-5">
		<div class="row g-4 justify-content-center">

			<!-- card -1  -->

			<div class="col-12 col-sm-6 col-lg-3 ">
				<div class="card border-danger bg-danger-subtle pt-4">
					<img src="./logo_1.png" class="card-img-top w-50 mx-auto d-block"
						alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card’s content.</p>
						<a href="#" class="btn btn-danger">Go somewhere</a>
					</div>
				</div>
			</div>

			<!-- card - 2 -->
			<div class="col-12 col-sm-6 col-lg-3">
				<div class="card border-warning bg-warning-subtle pt-4">
					<img src="./logo_2.png" class="card-img-top w-50 mx-auto d-block"
						alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card’s content.</p>
						<a href="#" class="btn btn-warning">Go somewhere</a>
					</div>
				</div>
			</div>

			<!-- card-3 -->
			<div class="col-12 col-sm-6 col-lg-3">
				<div class="card border-info bg-info-subtle pt-4">
					<img src="./logo_3.png" class="card-img-top w-50 mx-auto d-block"
						alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card’s content.</p>
						<a href="#" class="btn btn-info text-light border">Go
							somewhere</a>
					</div>
				</div>
			</div>

			<!-- card - 4  -->
			<div class="col-12 col-sm-6 col-lg-3">
				<div class="card border-success bg-success-subtle pt-4">
					<img src="./logo_4.png" class="card-img-top w-50 mx-auto d-block"
						alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card’s content.</p>
						<a href="#" class="btn btn-success">Go somewhere</a>
					</div>
				</div>
			</div>


		</div>
	</div>

	<div class="container-fluid p-4">
		<div class="row">
			<div class="card border-primary">
				<div class="card-header text-primary border-bottom border-primary">
					Featured</div>
				<div class="card-body">
					<h5 class="card-title">Special title treatment</h5>
					<p class="card-text">With supporting text below as a natural
						lead-in to additional content.</p>
					<a href="#" class="btn btn-primary">Go somewhere</a>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/common/footer.jsp" />