<%@page import="dao.Studentdao"%>

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



<% int id=Integer.parseInt(request.getParameter("id"));





Studentdao dao=new Studentdao();

Student student=dao.find(id);

%>



<form action="update">

<table>

<tr>

<th>Id:</th>

<th><input type="text" name="id" value="<%=id%>" readonly="readonly"></th>

</tr>

<tr>

<th>Name:</th>

<th><input type="text" name="name" value="<%=student.getName()%>"></th>

</tr>

<tr>

<th>Mobile:</th>

<th><input type="tel" name="mobile" value="<%=student.getMobile()%>" pattern="[0-9]{10}"></th>

</tr>

<tr>

<th>Email:</th>

<th><input type="email" name="email" value="<%=student.getEmail()%>"></th>

</tr>

<tr>

<th>Date of Birth:</th>

<th><input type="date" name="dob" value="<%=student.getDob()%>"></th>

</tr>

<tr>

<th>Gender:</th>



<%if(student.getGender().equals("male")){ %>

<th>

<input type="radio" name="gender" value="male" checked="checked">Male

<input type="radio" name="gender" value="female">Female

</th>

<%}else{ %>

<th>

<input type="radio" name="gender" value="male">Male

<input type="radio" name="gender" value="female" checked="checked">Female

</th>

<%} %>

</tr>

<tr>

<th>Address:</th>

<th><textarea rows="5" cols="30" name="address"><%=student.getAddress()%></textarea> </th>

</tr>

<tr>

<th>Skills:</th>

<th>



<%for(String s:student.getLanguages()){   

if(s.equals("language")){

%>

<input type="checkbox" name="language" value="kannada" checked="checked">Kannada

<%

}else{ %>

<input type="checkbox" name="language" value="kannada">Kannada

<%} %>

<% if(s.equals("english")){%>

<input type="checkbox" name="language" value="english" checked="checked">English

<%

continue;

}else{ %>

<input type="checkbox" name="language" value="english">English

<%} %>

<% if(s.equals("hindi")){%>

<input type="checkbox" name="language" value="hindi" checked="checked">Hindi

<%continue;

}else{ %>

<input type="checkbox" name="language" value="hindi">Hindi

<%} %>

<%} %>

</th>

</tr>

<tr>

<th>Country:</th>

<th>

<select name="country"> 

<option>India</option>

<option>Uganda</option>

<option>UAE</option>

</select>

</th>

</tr>

<tr>

<th><button type="reset">Cancel</button></th>

<th><button>Update</button></th>

</tr>

</table>

</form>

</body>

</html>