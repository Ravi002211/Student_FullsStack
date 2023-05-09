<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
 <h2>Login here</h2>
	<div class="login">
	<form action="log" method="post">
	<label><b>User Name</b></label>
	<br>
	<input type="text" id="textBox" name="uname" placeholder="UserName">
	<br><br>
	<label><b>Password</b></label>
	<br>
	<input type="password" id="textBox" name="pass" placeholder="Password">
	<br><br>
	<input type="submit" id="submit" value="Log In">
	<br><br>
	<a href="register.jsp">New user? Register here</a>
	</form>
	</div>
</body>
</html>