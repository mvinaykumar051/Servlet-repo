package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


import dao.Studentdao;
import dto.Student;

@WebServlet("/fetchall")
public class Fetchall extends GenericServlet {

@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//res.getWriter().print("<html><body>"
//+ "<table border='1'>"
//+ "<tr>"
//+ "<th>Id</th>"
//+ "<th>Name</th>"
//+ "<th>Mobile</th>"
//+ "<th>Email</th>"
//+ "<th>Gender</th>"
//+ "<th>Address</th>"
//+ "<th>State</th>"
//+ "<th>Dob</th>"
//+ "<th>Languages</th>"
//+ "</tr>");

Studentdao d=new Studentdao();
List<Student> l=d.fetchAll();
req.setAttribute("list", l);
req.getRequestDispatcher("fetchall.jsp").forward(req, res);
//List<Student> l=d.fetchAll();
//for(Student s:l){
//res.getWriter().print("<tr>"
//+ "<th>"+s.getId()+"</th>"
//+ "<th>"+s.getAddress()+"</th>"
//+ "<th>"+s.getEmail()+"</th>"
//+ "<th>"+s.getGender()+"</th>"
//+ "<th>"+s.getMobile()+"</th>"
//+ "<th>"+s.getName()+"</th>"
//+ "<th>"+s.getState()+"</th>"
//+ "<th>"+s.getDob()+"</th>"
//+ "<th>"+Arrays.toString(s.getLanguages())+"</th>"
//+ "</tr>");
//}
//res.getWriter().print("</table></body></html>");
}
}
