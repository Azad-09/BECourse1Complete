<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>News CRUD Spring</title>
</head>

<body onload="">
	<div class="container">
		<div class="jumbotron" style="margin: 45px 0px">
			<h2 class="text-center">Note CRUD APP</h2>
		</div>

		<form method="POST" action="saveMovie" modelAttribute="movie">

			<div class="form-group">
				<label for="MovieID">Movie ID</label> <input type="text"
					class="form-control" id="MovieID" aria-describedby="name"
					placeholder="Enter Movie ID" name="MovieID">
			</div>

			<div class="form-group">
				<label for="Name">Movie Title</label>
				<input type="text"
					class="form-control" id="Name" aria-describedby="name"
					placeholder="Enter Name" name="Name">
			</div>
			
			<div class="form-group">
				<label for="Category">Note Text</label>
				<input type="text" class="form-control" id="Category"
					placeholder="Enter category" name="Category">
			</div>
			
			<div class="form-group">
				<label for="ticketPrice">Note Category</label>
				<input type="text" class="form-control" id="ticketPrice"
					placeholder="Enter price" name="ticketPrice">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

		<div style="margin-top: 1em; text-align: center">
			<h2>All News Information</h2>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Category</th>
						<th scope="col">Price</th>
					</tr>
				</thead>
				<tbody id='table-body'>
					<c:forEach items="${newsList}" var="newsobj">
						<tr>
							<td>${newsobj.MovieID}</td>
							<td>${newsobj.Name}</td>
							<td>${newsobj.Category}</td>
							<td>${newsobj.ticketPrice}</td>
							<td>Update</td>
							<td>Delete</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
		crossorigin="anonymous"></script>
</body>
</html>