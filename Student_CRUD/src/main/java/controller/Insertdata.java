package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.Student;
  
@WebServlet("/insert")
public class Insertdata extends GenericServlet {

@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//String name=req.getParameter("name");
//long mobile=Long.parseLong(req.getParameter("mobile"));
//String email=req.getParameter("email");
//String gender=req.getParameter("gender");
//Date dob=Date.valueOf(req.getParameter("dob"));
//String address=req.getParameter("address");
//String[] languages=req.getParameterValues("languages");
//String state=req.getParameter("country");

//res.getWriter().print("<h1>"
//+ "Name:"+name
//+ "<br>Mobile:"+mobile
//+ "<br>Email:"+email
//+ "<br>Gender:"+gender
//+ "<br>Dob:"+dob
//+ "<br>Address:"+address
//+ "<br>state:"+state
//+ "<br>Languages:"+Arrays.toString(languages)
//
//+ "</h1>");

Student s=new Student();
s.setAddress(req.getParameter("address"));
s.setDob(Date.valueOf(req.getParameter("dob")));
s.setEmail(req.getParameter("email"));
s.setGender(req.getParameter("gender"));
s.setLanguages(req.getParameterValues("language"));
s.setMobile(Long.parseLong(req.getParameter("mobile")));
s.setName(req.getParameter("name"));

s.setState(req.getParameter("state"));


Studentdao s1=new Studentdao();
s1.save(s);

res.getWriter().print("<h1>Data saved successfully</h1>");
req.getRequestDispatcher("Home.html").include(req, res);
}

}