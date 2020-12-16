<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>
	<h1>On show page!</h1>
	<p><c:out value="${2+2}"/></p>
	<h2>Name: <c:out value="${userName}"/> From: <c:out value="${useLocation}"/></h2>

</body>
</html>