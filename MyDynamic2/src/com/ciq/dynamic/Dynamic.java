package com.ciq.dynamic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Dynamic")
public class Dynamic implements Servlet {
//	private static final long SerialVersionUID = 10l;

	public void destroy() {
	System.out.println(" Servlet Destroy......");
		
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
	System.out.println(" Servlet init......");
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		PrintWriter  pw=arg1.getWriter();
		pw.println("<h1> hello world</h1>");
		pw.flush();
		pw.close();
		
	}

}
