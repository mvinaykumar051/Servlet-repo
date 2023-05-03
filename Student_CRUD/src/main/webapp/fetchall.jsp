<%@page import="java.util.Arrays"%>

<%@page import="dto.Student"%>

<%@page import="java.util.List"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<body>



<%List<Student> list=(List<Student>)request.getAttribute("list"); %>



<%= list %>

<table border="1">

<tr>

<th>Id</th>

<th>Name</th>

<th>Address</th>

<th>Email</th>

<th>Gender</th>

<th>DOB</th>

<th>Mobile</th>

<th>State</th>

<th>language</th>

<th>Delete</th>

<th>Edit</th>

</tr>

<%for(Student student:list){ %>

<tr>

<th><%= student.getId()%></th>

<th><%= student.getName() %></th>



<th><%= student.getAddress()%></th>

<th><%= student.getEmail() %></th>

<th><%= student.getGender() %></th>

<th><%= student.getDob() %></th>

<th><%= student.getMobile()%></th>

<th><%= student.getState() %></th>





<th><%= Arrays.toString(student.getLanguages()) %></th>

<th><a href="delete?=<%= student.getId()%>"><button>Delete</button></a></th>

<th><a href="edit?=<%= student.getId()%>"><button>Edit</button></a></th>

</tr>       



<%} %>

</table><br>

<a href="Home.html"><button>Home</button></a>

</body>

</html>

