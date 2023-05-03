package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/update")
public class Update extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

Student s=new Student();
s.setId(Integer.parseInt(req.getParameter("id")));
s.setAddress(req.getParameter("address"));
s.setDob(Date.valueOf(req.getParameter("dob")));
s.setEmail(req.getParameter("email"));
s.setGender(req.getParameter("gender"));
s.setLanguages(req.getParameterValues("language"));
s.setMobile(Long.parseLong(req.getParameter("mobile")));
s.setName(req.getParameter("name"));

s.setState(req.getParameter("state"));


Studentdao s1=new Studentdao();
s1.update(s);

res.getWriter().print("<h1>Data updated successfully</h1>");

req.setAttribute("list", s1.fetchAll());
req.getRequestDispatcher("FetchAll.jsp").include(req, res);
}

}
