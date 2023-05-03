package Demo;

import java.io.IOException;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")

public class Hello implements Servlet{

	static{
		System.out.println(" Hello Class is Loaded");
	}

	public Hello() {
		System.out.println("Object for Hello Class Created");
	}
	
public void destroy() {
	// TODO Auto-generated method stub
	
	System.out.println("Hello Class destroy method is invoked");
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
	
	System.out.println("Hello Class init method is invoked");
}

public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	System.out.println("Hello Class Service Method is invoked");
}
}
