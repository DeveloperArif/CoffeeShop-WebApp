<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel = "stylesheet" href = "/style.css"/>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body">
<main> 

<form action = "/coffeeshop-results" method = "post">  
									<!-- post makes sure not to post the parameters at the URL
									Get allows the parameters to be seen at the URL -->
<h1> Welcome to my coffee shop!   Please register below to view our menu :) </h1>
<p> <img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Coffee_break_%283457656569%29.jpg/800px-Coffee_break_%283457656569%29.jpg"/> </p>
<p>
<label>First Name:</label> <input name = "first-name" required minlength = "2" pattern = "[A-Z][a-z]*" /> </p>

<p><label>Last Name:</label> <input name = "last-name" required minlength = "2" pattern = "[A-Z][a-z]*" /> </p>


<p>
Age: <input name = "age" minlength = "2" maxlength = "3" step = "1"/> </p>

<p>
Email: <input type = "email" name = "email"/> </p>

<p> Cup(s) of coffee per day: <input name = "coffeeCups" /> </p>

<p>
			<label>Password:</label> <input type="password" name="password" />
		</p>

<p>

<button>Submit</button> </p>


</form>
</main>
<footer><a href="/item" class = "btn btn-primary">Admin</a></footer>
</body>
</html>