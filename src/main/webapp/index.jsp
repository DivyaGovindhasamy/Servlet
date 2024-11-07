<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<% response.sendRedirect("login.jsp"); %>
	<h1>Index Page</h1>
	<a href="hi">Click here to say Hi</a>
	<form action="hi"method="post">
	<button type="submit">submit</button>
	</form>
	<br>
	<br>
	<h1>Login Here</h1>
	<form action="login"method="get">
	<p><b>Email</b></p>
	<input type="emial"name="email"placeholder="Enter your email">
	<p><b>Password</b></p>
	<input type="password"name="password"placeholder="Enter your password">
	<button type="submit">Login</button>
	</form>
</body>
</html>