<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
  
  
  
      <link rel="stylesheet" href="logincss/css/style.css">

  
</head>

<body>
  <body>
	<div class="login">
		<div class="login-screen">
			<div class="app-title">
				<h1>Login</h1>
			</div>

			<div class="login-form">
			<form name="loginForm"
						action="<c:url value="/loginaction"/>"  method="post">
				<div class="control-group">
				<input type="text" class="login-field" name="username" placeholder="username" id="login-name">
				<label class="login-field-icon fui-user" for="login-name"></label>
				</div>

				<div class="control-group">
				<input type="password" class="login-field" name="password" placeholder="password" id="login-pass">
				<label class="login-field-icon fui-lock" for="login-pass"></label>
				</div>
				<button type="submit" class="btn btn-primary btn-large btn-block"
									>Login</button>
				<a class="login-link" href="#">Lost your password?</a>
					</form>
			</div>
		
		</div>
	</div>
</body>
  
  
</body>
</html>
