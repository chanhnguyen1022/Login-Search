<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
</head>
<body bgcolor="#2EFEF7">
	<form action="3C.do" method="post" id="formDemo" name="MyForm">

		<div id="header">
			<h2 style="color: red;">Training</h2>

		</div>
		<hr>
		<h3>Login</h3>
		<div id="center" style="padding-top: 50px; padding-bottom: 220px;">
			<table align="center">

				<tr>
					<th colspan="2"><h1 style="color: BLUE;">LOGIN</h1></th>
				</tr>

				<tr>
					<th colspan="2"><h5 id="error" style="color: red;"></h5></th>
				</tr>

				<tr>
					<td>UserID:</td>
					<td> <input type="text" name="userId" size="50" /><br></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="text" name="password" size="50" /><br></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Login"> <input type="button" id="reset"
						value="Clear"></td>
				</tr>

			</table>
		</div>
		<hr>

		<div id="footer">
			<label>Copy right@ 2000-2008 FUJINET, All Rights Reserved.</label>

		</div>
	</form>

	<script type="text/javascript">
		// Form validation code will come here.

		function validate() {
			var result = false;
			if (document.MyForm.UserId.value === ""
					|| document.MyForm.UserId.value === null) {
				document.getElementById("error").innerHTML = "Please insert userId";
				result = false;
			}

			else if (document.MyForm.Password.value === ""
					|| document.MyForm.Password.value === null) {
				document.getElementById("error").innerHTML = "Please insert password";
				result = false;

			} else {
				result = true;
			}
			return result;
		}
		$("#reset").click(function(event) {
			document.MyForm.UserId.value = "";
			document.MyForm.Password.value = "";
			document.getElementById("error").innerHTML = "";
		});
		$("#formDemo").submit(function(event) {
			return validate() ;
		});
	</script>
</body>
</html>