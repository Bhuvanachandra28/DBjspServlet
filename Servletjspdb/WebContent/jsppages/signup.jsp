<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
    <div align="center">
<form action="${pageContext.request.contextPath}/SignUp" method="post"> 
     Enter your username: <input type = "text" name="username"/><br>
     Enter your password : <input type = "text" name="password"/><br>
     
     <input type = "submit" value = "Register" />
  </form>
 </div>
</body>
</html>