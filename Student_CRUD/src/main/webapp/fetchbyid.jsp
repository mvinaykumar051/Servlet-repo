<%@page import="java.util.Arrays"%>

<%@page import="dto.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

<% Student student=(Student)request.getAttribute("student"); %>



<table border="1">

<tr>

<th>Id</th>

<th>Name</th>

<th>Mobile</th>

<th>Email</th>

<th>Gender</th>

<th>DOB</th>

<th>Address</th>

<th>Country</th>

<th>language</th>

<th>Delete</th>

<th>Exit</th>

</tr>

<tr>

<th><%= student.getId()%></th>

<th><%= student.getName() %></th>



<th><%= student.getAddress()%></th>
,
<th><%= student.getEmail() %></th>

<th><%= student.getGender() %></th>

<th><%= student.getDob() %></th>

<th><%= student.getLanguages() %></th>

<th><%= student.getState() %></th>

<th><%= Arrays.toString(student.getLanguages()) %></th>

<th><a href="delete?id=<%= student.getId()%>"><button>Delete</button></a></th>

<th><button>Edit</button></th>

</tr>

</table>

<br>

<a href="Home.html"><button>Home</button></a>



</body>

</html>