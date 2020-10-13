<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Displays the time</h3>
	<h5>Time: ${time}</h5>
	
	<form action = "user" method = "post">
	<label>
		Enter id <input type = "text" name = "userid"> 
		<input type = "submit" value = "Search">
	</label>
	</form>
	<hr />
	<form action = "userByName" method = "post">
	<label>
		Enter Name <input type = "text" name = "userid"> 
		<input type = "submit" value = "Search">
	</label>
	</form>
</body>
</html>