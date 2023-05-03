package controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


import dao.Studentdao;
import dto.Student;


@WebServlet("/fetchbyid")
public class FetchDataById extends GenericServlet
{

@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

// int id=Integer.parseInt(req.getParameter("Id"));

Studentdao dao=new Studentdao();
// Execution_Class execution_Class=new Execution_Class();
Student student=dao.find(Integer.parseInt(req.getParameter("Id")));

if(student==null)
{
res.getWriter().print("<h1>No data found with the Entered ID</h1>");
req.getRequestDispatcher("Enter_Id.html").include(req, res);
req.getRequestDispatcher("Crud_Opeartions").include(req, res);
}

else
{
req.setAttribute("Students", student);
req.getRequestDispatcher("Fetch_By_Id.jsp").forward(req, res);

// res.getWriter().print("<html><body>"
// + "<table border='1'>"
// + "<tr>"
// + "<th>id</th>"
// + "<th>First_Name</th>"
// + "<th>Last_Name</th>"
// + "<th>Mobile_Number</th>"
// + "<th>Email</th>"
// + "<th>Gender</th>"
// + "<th>dob</th>"
// + "<th>Address</th>"
// + "<th>State</th>"
// + "<th>Country</th>"
// + "<th>Skills</th>"
// + "</tr>");
// res.getWriter().print("<tr>"
// + "<th>"+students.getId()+"</th>"
// + "<th>"+students.getFirst_Name()+"</th>"
// + "<th>"+students.getLast_Name()+"</th>"
// + "<th>"+students.getMobileNumber()+"</th>"
// + "<th>"+students.getEmail()+"</th>"
// + "<th>"+students.getGender()+"</th>"
// + "<th>"+students.getDob()+"</th>"
// + "<th>"+students.getAddress()+"</th>"
// + "<th>"+students.getState()+"</th>"
// + "<th>"+students.getCountry()+"</th>"
// + "<th>"+Arrays.toString(students.getSkills())+"</th>"
// + "</tr>");
// res.getWriter().print("</table>"
// + "<br>"
// + "<a href='Crud_Operations.html'><button>Home</button></a>"
// + "</body></html>");
}
}

}