<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey with Counter</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<div class="col-6 offset-3 border border-dark mt-3">
	<h1><u>Submitted Info:</u> Submitted: <c:out value="${counter}"/> times.</h1>
  <div class="form-group row">
    <h2 class="col-sm-2 col-form-label">Name:</h2>
    <div class="col-sm-10">
      <p><c:out value="${name}"/></p>
    </div>
  </div>
  <div class="form-group row">
    <h2 class="col-sm-2 col-form-label">Location:</h2>
    <div class="col-sm-10">
      <p><c:out value="${location}"/></p>
    </div>
  </div>
  <div class="form-group row">
    <h2 class="col-sm-2 col-form-label">Language:</h2>
    <div class="col-sm-10">
		<p><c:out value="${language}"/></p>
    </div>
  </div>
   <div class="form-group row">
    <h2 class="col-sm-2 col-form-label">Comment:</h2>
    <div class="col-sm-10">
      <p><c:out value="${comment}"/></p>
    </div>
  </div>
    <div class="form-group row">
    <div class="col-sm-3 offset-sm-9">
      <a href="/" class="btn btn-primary btn-block">Go Back</a>
    </div>
  </div>

</div>
</div>

</body>
</html>