<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<link rel = "stylesheet" href = "/style.css"/>

<meta charset="ISO-8859-1">
<title>Coffee Shop Menu </title>
</head>
<body>
<p> ${Result} </p>


<table class = "table">

<thead>
<tr>
	<th>Coffee</th><th>Price</th>
</tr>
</thead>

<tbody>

<c:forEach items="${items }" var = "item" >

<tr>
	<td>${item.name }</td> <td>${item.price } </td>
	
</tr>
</c:forEach>

</tbody>


</table>


</body>
</html>