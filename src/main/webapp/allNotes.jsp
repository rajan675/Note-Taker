<%@page import="org.hibernate.Query"%>
<%@page import="com.todo.Note"%>
<%@page import="java.util.List"%>
<%@page import="com.todo.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>All Notes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<%@include file="NavBar.jsp"%>
	<div class="container">
		<br>
		<h1>All Notes:</h1>
		<div class='row'>
			<div class='col-12'>
				<%
				Session s = com.todo.FactoryProvider.getFactory().openSession();
				Query q = s.createQuery("from Note");
				List<Note> list = (List<Note>) q.list();
				for (Note note1 : list) {
				%>
				<div class="card mt-3">
					<div class="card-body">
						<h5 class="card-title"><%= note1.getTitle() %></h5>
						<p class="card-text"><%=note1.getContent() %></p>
						<a href="deleteservlet?note1.id=<%= note1.getId() %>" class="btn btn-danger">Delete</a>
                        <a href="update.jsp?note1.id=<%= note1.getId() %>" class="btn btn-primary">Update</a>
						
					</div>
				</div>

				<%
				}
				s.close();
				%>



			</div>
		</div>

	</div>
</body>
</html>