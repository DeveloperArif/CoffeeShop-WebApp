<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><main class="container">
		<h1>${ title }</h1>
		
		<form method="post">
			<div class="form-group">
			    <label for="name">Name</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <input class="form-control" id="name" name="name" value="${item.name}" required minlength="2" autocomplete="off">
			</div>
			<div class="form-group">
			    <label for="price">Price</label>
			    <input class="form-control" id="price" name="price" value="${item.price}" required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="/item" class="btn btn-link">Cancel</a>
		</form>
	</main>

</body>
</html>