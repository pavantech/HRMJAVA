<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CLIENT REGISTER HERE</title>
<link rel="icon" type="image/x-icon"
	href="<c:url value="images/favicon1.png"/>" />
<link rel="stylesheet"
	href="<c:url value="bootstrap/css/bootstrap.min.css"/>">
<script src="<c:url value="js/jquery.js"/>"></script>
<script src="<c:url value="bootstrap/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" type="text/css"
	href="<c:url value="css/register.css"/>">

</head>
<body>
<c:if test="${ empty username}"> 
   <div id="success" class="success"> 
     <c:redirect url = "login"/> 
   </div> 
 </c:if> 
	<%@ include file="AdminNavBar.jsp"%> 
	<div class="container" style="margin-bottom: 19px">
		<h1 class="well">Product Manager Register</h1>
		<div class="col-lg-12 well">
			<div class="row">
                <c:if test="${not empty registrationSuccess}">
						<div class="error" style="color: #ff0000;">${registrationSuccess}</div>
					</c:if>
				<!--  RegisterServlet  form -->
				<form:form method="post" action="/clientRegisterAction" commandName="customer">
					<div class="col-sm-12">
						<div class="row">
							<div>
								<center>Client Details</center>
							</div>			
						
							<div class="col-sm-6 form-group">
								<form:label path="emailId">Email Id</form:label>
								<form:input type="text" placeholder="Enter Email ID.."
									class="form-control" path="emailId" id="emailId" ></form:input>
								<form:errors path="emailId"></form:errors>
								<h6 style="color:red;"><p id="validresult1"></p></h6>
							</div>
							<div class="col-sm-6 form-group">
								<form:label path="phoneWithCode">Phone Number</form:label>
								<form:input type="text" placeholder="Enter Phone Number.."
									class="form-control" path="phoneWithCode" id="phoneWithCode"></form:input>
								<form:errors path="phoneWithCode"></form:errors>
								<h6 style="color:red;"><p id="validresult2"></p></h6>
							</div>
							</div>
							<hr>
							<div class="row">
							<div class="col-sm-6 form-group">
								<form:label path="firstName">First Name</form:label>
								<form:input type="text" placeholder="Enter First Name"
									class="form-control" path="firstName" id="firstName"></form:input>
									<form:errors path="firstName"></form:errors>
								<h6 style="color:red;"><p id="validresult3"></p></h6>
							</div>
							<div class="col-sm-6 form-group">
								<form:label path="lastName">Last Name</form:label>
								<form:input type="text" placeholder="Enter Last Name"
									class="form-control" path="lastName" id="lastName"></form:input>
									<form:errors path="lastName"></form:errors>
								<h6 style="color:red;"><p id="validresult3"></p></h6>
							</div>
						</div>
						<hr>
							<div class="row">
							<div class="col-sm-6 form-group">
								<form:label path="password">Password</form:label>
								<form:input type="password" placeholder="********"
									class="form-control" path="password" id="pass"></form:input>
									<form:errors path="password"></form:errors>
								<h6 style="color:red;"><p id="validresult3"></p></h6>
							</div>
							<div class="col-sm-6 form-group">
								<label>Confirm Password</label> <input type="password"
									placeholder="********" class="form-control" id="confirmpass" />
							</div>
						</div>
						<hr>
						<div>
							<center>Billing Address</center>
						</div>
						<div class="form-group">
							<form:label path="address">Address</form:label>
							<form:textarea type="text" placeholder="Enter  Address.."
								class="form-control" path="address" id="address"></form:textarea>
								<form:errors path="address"></form:errors>
								<h6 style="color:red;"><p id="validresult4"></p></h6>
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
								<form:label path="city">City</form:label>
								<form:input type="text" placeholder="Enter Current City.."
									class="form-control" path="city" id="city"></form:input>
									<form:errors path="city"></form:errors>
								<h6 style="color:red;"><p id="validresult5"></p></h6>
							</div>
							<div class="col-sm-6 form-group">
								<form:label path="state">State</form:label>
								<form:input type="text" placeholder="Enter your State.."
									class="form-control" path="state" id="state"></form:input>
								<form:errors path="state"></form:errors>
								<h6 style="color:red;"><p id="validresult6"></p></h6>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
								<form:label path="country">Country</form:label>
								<form:input type="text" placeholder="Enter your country.."
									class="form-control" path="country" id="country"></form:input>
									<form:errors path="country"></form:errors>
								<h6 style="color:red;"><p id="validresult7"></p></h6>
							</div>
							<div class="col-sm-6 form-group">
								<form:label path="zipcode">Zipcode</form:label>
								<form:input type="text" placeholder="Enter zipcode.."
									class="form-control" path="zipcode" id="zipcode"></form:input>
									<form:errors path="zipcode"></form:errors>
								<h6 style="color:red;"><p id="validresult8"></p></h6>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
								<form:label path="organizationName">Organization Name</form:label>
								<form:input type="text" placeholder="Enter your country.."
									class="form-control" path="organizationName" id="organizationName"></form:input>
									<form:errors path="organizationName"></form:errors>
								<h6 style="color:red;"><p id="validresult7"></p></h6>
							</div>
							<div class="col-sm-6 form-group">
								<form:label path="aadhaarNumber">Aadhaar Number</form:label>
								<form:input type="text" placeholder="Enter zipcode.."
									class="form-control" path="aadhaarNumber" id="aadhaarNumber"></form:input>
									<form:errors path="aadhaarNumber"></form:errors>
								<h6 style="color:red;"><p id="validresult8"></p></h6>
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn btn-lg btn-info"
								onclick="return Validate()">Submit</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>

	<!-- Validating Password -->
	<script type="text/javascript">
		function Validate() {
			var password = document.getElementById("pass").value;
			var confirmpass = document.getElementById("confirmpass").value;
			if (password != confirmpass) {
				alert("Password does Not Match.");
				return false;
			}
			
			var x1=document.getElementById("emailid").value;
			if (x1.length==0) {
			var result1="Please  enter valied email"
				document.getElementById("validresult1").innerHTML=result1;
			return false;
			}
			else {
				var result1=""
					document.getElementById("validresult1").innerHTML=result1;
			}
			
			var x2=document.getElementById("phonenumber").value;
			if (x2.length==0) {
			var result2="Please  enter valied phonenumber"
				document.getElementById("validresult2").innerHTML=result2;
			return false;
			}
			else {
				var result2=""
					document.getElementById("validresult2").innerHTML=result2;
			}
			
			var x3=document.getElementById("pass").value;
			if (x3.length==0) {
			var result3="Please  enter valied password"
				document.getElementById("validresult3").innerHTML=result3;
			return false;
			}
			else {
				var result3=""
					document.getElementById("validresult3").innerHTML=result3;
			}
			
			var x4=document.getElementById("address").value;
			if (x4.length==0) {
			var result4="Please  enter valied address"
				document.getElementById("validresult4").innerHTML=result4;
			return false;
			}
			else {
				var result4=""
					document.getElementById("validresult4").innerHTML=result4;
			}
			
			var x5=document.getElementById("city").value;
			if (x5.length==0) {
			var result5="Please  enter valied city"
				document.getElementById("validresult5").innerHTML=result5;
			return false;
			}
			else {
				var result5=""
					document.getElementById("validresult5").innerHTML=result5;
			}
			
			var x6=document.getElementById("state").value;
			if (x6.length==0) {
			var result6="Please  enter valied state"
				document.getElementById("validresult6").innerHTML=result6;
			return false;
			}
			else {
				var result6=""
					document.getElementById("validresult6").innerHTML=result6;
			}
			
			var x7=document.getElementById("country").value;
			if (x7.length==0) {
			var result7="Please  enter valied country"
				document.getElementById("validresult7").innerHTML=result7;
			return false;
			}
			else {
				var result7=""
					document.getElementById("validresult7").innerHTML=result7;
			}
			
			var x8=document.getElementById("zipcode").value;
			if (x8.length==0) {
			var result8="Please  enter valied zipcode"
				document.getElementById("validresult8").innerHTML=result8;
			return false;
			}
			else {
				var result8=""
					document.getElementById("validresult8").innerHTML=result8;
			}
			
			return true;
		}
	</script>
</body>
</html>