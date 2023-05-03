package servlet_demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Hello")

public class Logic implements Servlet{


	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		System.out.println("Hello"); //one textbox
//		
		String fn=req.getParameter("fn");
		String ln=req.getParameter("ln");
//		System.out.println("Hello"+" "+fn+" "+ln);   // It will print in console
//		
//		res.getWriter().print("Good Evening "+fn+" "+ln); // This is print in Fronted
//		
		res.getWriter().print("<h1 style='color:red'>Good Evening "+fn+" "+ln+"</h1>");
	}

}
