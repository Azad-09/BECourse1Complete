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
<title>Movies</title>
</head>

<body onload="">
	<div class="container">
		<div class="jumbotron bg-secondary" style="margin: 45px 0px">
			<h2 class="text-center text-warning">Movie Details</h2>
		</div>

		<form method="POST" action="saveMovie" modelAttribute="movie">

			<div class="form-group">
				<label for="index">Index</label> <input type="text"
					class="form-control" id="index" aria-describedby="name"
					placeholder="Serial Number" name="index">
			</div>

			<div class="form-group">
				<label for="exampleInputTitle">Movie Name</label>
				<input type="text"
					class="form-control" id="movieName" aria-describedby="name"
					placeholder="Enter Movie Name" name="movieName">
			</div>

			<div class="form-group">
				<label for="exampleInputNoteText">Director</label>
				<input type="text" class="form-control" id="director"
					placeholder="Enter Director Name" name="director">
			</div>

			<div class="form-group">
				<label for="exampleInputNoteCategory">Release Year</label>
				<input type="text" class="form-control" id="releaseYear"
					placeholder="Enter Release Year" name="releaseYear">
			</div>

			<div class="form-group">
				<label for="exampleInputNoteCategory">Language</label>
				<input type="text" class="form-control" id="language"
					placeholder="Enter Released Language" name="language">
			</div>

			<button type="submit" class="btn btn-success">Submit</button>
		</form>


		<div style="margin-top: 1em; text-align: center">
			<h2>All Movies Information</h2>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Index</th>
						<th scope="col">Movie Name</th>
						<th scope="col">Director</th>
						<th scope="col">Release Year</th>
						<th scope="col">Language</th>
					</tr>
				</thead>
				<tbody id='table-body'>
					<c:forEach items="${movieList}" var="movieObj">
						<tr>
							<td>${movieObj.index}</td>
							<td>${movieObj.movieName}</td>
							<td>${movieObj.director}</td>
							<td>${movieObj.releaseYear}</td>
							<td>${movieObj.language}</td>
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