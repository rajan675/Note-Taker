<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="css/style.css" rel="stylesheet">
  </head>
<body>
<div class="container-fluid p-0 m-0">
  <%@include file="NavBar.jsp" %>
<div class="container"><br><br>
    <h3><b>Welcome to note taker</b></h3><br>
     &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <button type="button" class="btn btn-outline-success"><a href="addNote.jsp">Click to start</a></button>

  </div>
</div>
</body>
</html>