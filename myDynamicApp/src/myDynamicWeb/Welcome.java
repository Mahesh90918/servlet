package myDynamicWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome implements Servlet{

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
		System.out.println("continue inti.....");
		
	}

	public void service(ServletRequest arg0, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr=resp.getWriter();
		pr.println("<html>");
		pr.println("<body>");
		pr.println("<h1> Welcome implements Servlet</h1>");
		pr.println("<h2> Welcome to Servlet mahesh</h2>");
		pr.println("<body>");
		pr.println("<html>");
		pr.flush();
		pr.close();
		
	}

}
