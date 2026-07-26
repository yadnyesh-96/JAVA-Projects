<%@ page import="com.oem.model.Subject,java.util.List"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Subject</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body class="bg-light">

	<div class="container py-5">

		<!-- Banner -->
		<div
			class=" bg-primary text-white text-start rounded py-4  px-5 mb-4 shadow">
			<h2>Subject Management</h2>
			<p class="mb-0">Department of Online Examination</p>
		</div>

		<!-- Form Card -->
		<div class="card shadow">
			<div class="card-header bg-dark text-white">
				<h3 class="mb-0">Update Subject</h3>
				<small>Fill the details below to Update the subject.</small>
			</div>

			<div class="card-body">

				<form action="UpdateSubject" method="post">

					<input type="hidden" name="subId" value="${subject.subId}">

					<div class="mb-3">
						<label>Subject Name</label> <input type="text"
							class="form-control" name="subject" value="${subject.subName}">
					</div>

					<div class="mb-3">
						<label>Description</label>
						<textarea class="form-control" name="description">${subject.subDesc}</textarea>
					</div>

					<button class="btn btn-success">Update Subject</button>
					<button type="button" class="btn btn-danger"
						onclick="history.back()">Cancel</button>

				</form>

			</div>
		</div>

	</div>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<script>
		const params = new URLSearchParams(window.location.search);
		const msg = params.get("msg");

		if (msg === "failed") {
			alert("Subject Updation Failed");
		}
	</script>

</body>

</html>