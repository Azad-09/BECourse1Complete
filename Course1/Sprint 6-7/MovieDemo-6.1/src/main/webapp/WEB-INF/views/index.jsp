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
<title>Movie CRUD Spring</title>
</head>
<body onload="">
	<div class="container">
		<div class="jumbotron" style="margin: 45px 0px">
			<h2 class="text-center">Movie Demo Form</h2>
		</div>
		<form method="POST" action="savemovie" modelAttribute="movie">

        			<div class="form-group">
        				<label for="movieID">Movie ID</label> <input type="text"
        					class="form-control" id="movieID" aria-describedby="name"
        					placeholder="Enter movie ID" name="movieID">
        			</div>

        			<div class="form-group">
        				<label for="Name">Movie title</label>
        				<input type="text"
        					class="form-control" id="Name" aria-describedby="Name"
        					placeholder="Enter Name" name="Name">
        			</div>

        			<div class="form-group">
        				<label for="Category">Category</label>
        				<input type="text" class="form-control" id="Category"
        					placeholder="Enter Category" name="Category">
        			</div>

        			<div class="form-group">
        				<label for="ticketPrice">price</label>
        				<input type="text" class="form-control" id="ticketPrice"
        					placeholder="Enter ticketPrice" name="ticketPrice">
        			</div>

        			<button type="submit" class="btn btn-primary">Submit</button>
        		</form>

        		</body>
        		</html>