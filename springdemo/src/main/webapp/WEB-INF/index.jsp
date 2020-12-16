<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/demo/process" method="post">
		<label for="name">Name:</label>
		<br>
		<input type="text" name="full_name" id="name">
		<br>
		<button>Submit</button>
	</form>
	<c:if test="${name_for_jsp != null}">
		<h2>Name: <c:out value="${name_for_jsp}"/> </h2>
	</c:if>
	<p><c:out value="${success}"/></p>
</body>
</html>