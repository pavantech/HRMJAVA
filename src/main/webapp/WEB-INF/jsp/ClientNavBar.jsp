<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" type="image/x-icon"
	href="<c:url value="images/favicon1.png"/>" />
<link rel="stylesheet"
	href="<c:url value="bootstrap/css/bootstrap.min.css"/>">
<script src="<c:url value="js/jquery.js"/>"></script>
<script src="<c:url value="bootstrap/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="css/overall.css"/>">
</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="nav navbar">
			<img class="navbar-brand" src="images/shopieasy-logo.png"
				href="<c:url value="/index"/>" width="200px" height="100px"
				alt="logo-image"></img>
		</div>

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="<c:url value="/index" />">ShopIeasy</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li><a href=" <c:url value="/AdminDashboard" />">Home</a></li>


				<li><a href=" <c:url value="/getEmployeeList" />">Employee
						List</a></li>
				<li><a href=" <c:url value="/EmployeeRegister" />">Employee
						Register</a></li>
				
			</ul>
			


			<ul class="nav navbar-nav navbar-right">
				<li><a href="<c:url value="/customer/registration" />"><span
						class="glyphicon glyphicon-log-user"></span>Settings</a></li>
				<li><a href="<c:url value="Logout" />"><span
						class="glyphicon glyphicon-log-in"></span> Logout</a></li>

			</ul>
			
		</div>
	</div>
	</nav>
</html>