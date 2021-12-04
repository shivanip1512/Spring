<%@page isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>


<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Contact</title>
</head>
<body>

	<div class="container mt-5">
	<h1 class="text-center">${header_ }</h1>
	<h5 class="text-center">${desc }</h5>
	<h2 class="text-center"><b>Registration form</b></h2>
	<form action="processFormUsingMA" method="post">
	
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label>
			 <input
				type="email" 
				class="form-control" 
				name="email"
				id="exampleInputEmail1"
				aria-describedby="emailHelp" 
				placeholder="Enter email"> 
				<small
				id="emailHelp" class="form-text text-muted">We'll never
				share your email with anyone else.</small>
		</div>
		<div class="form-group">
			<label for="userName">User Name</label> 
			<input
				type="text" 
				class="form-control" 
				name="userName"
				id="userName"
				aria-describedby="userNameHelp" 
				placeholder="Enter Name"> 
				
		</div><div class="form-group">
			<label for="userPassword">Passwords</label> 
			<input
				type="password" 
				class="form-control"
				name="userPassword" 
				id="userPassword"
				aria-describedby="passwordHelp" 
				placeholder="Enter Password"> 
		</div>
		<div class="container text-center">
		<button type="submit" class="btn btn-primary">Submit</button></div>
	</form>
	
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>