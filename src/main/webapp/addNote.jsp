<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>AddNote</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="css/style.css" rel="stylesheet">
  </head>
<body>
  <%@include file="NavBar.jsp" %><br>
  <!-- This is form -->
  <div class="container">
    <h3><b>Please fill your note details</b></h3>
  
   <form action="servletsave" method="post">
  <div class="mb-3">
    <label for="title" class="form-label"><b>Note Tile</b></label>
    <input required="required" type="text" class="form-control" id="title" name="title" placeholder="Enter title here">
  </div>
  <div class="mb-3">
    <label for="content" class="form-label"><b>Note Content</b></label>
    <textarea required="required" id="content" name="content" placeholder="Enter content here" class="form-control" style="height:250px "></textarea>
  </div>
  <center>
  <button type="submit" class="btn btn-primary">Add</button></center>
</form>
  </div>

</body>
</html>