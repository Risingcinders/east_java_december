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
	<h1>Dojo Survey</h1>
	<form action="/process" method="post">
  <div class="form-group row">
    <label for="name" class="col-sm-2 col-form-label">Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name">
    </div>
  </div>
  <div class="form-group row">
    <label for="location" class="col-sm-2 col-form-label">Location:</label>
    <div class="col-sm-10">
      <select class="form-control" id="location" name="location">
      	<option>San Jose</option>
      	<option>Seattle</option>
      	<option>Tulsa</option>
      	<option>Online</option>
      </select>
    </div>
  </div>
  <div class="form-group row">
    <label for="language" class="col-sm-2 col-form-label">Language:</label>
    <div class="col-sm-10">
      <select class="form-control" id="language" name="language">
      	<option>Python</option>
      	<option>Java Script</option>
      	<option>Java</option>
      	<option>C#</option>
      </select>
    </div>
  </div>
   <div class="form-group row">
    <label for="comment" class="col-sm-2 col-form-label">Comment:</label>
    <div class="col-sm-10">
      <textarea class="form-control" name="comment" id="comment"></textarea>
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-3 offset-sm-9">
      <button type="submit" class="btn btn-primary btn-block">Submit</button>
    </div>
  </div>
</form>
</div>
</div>

</body>
</html>