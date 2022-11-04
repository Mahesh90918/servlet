package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfingure
 */
public class ServletConfingure extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("userName :" + config.getInitParameter("user"));
		System.out.println("PassWord :" + config.getInitParameter("password"));
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		ServletConfig config = getServletConfig(); 
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");
		p.println("User     :" + "<b>"+user+"</b>" +"<br><br>");
		p.println("password :" +"<i>"+ password+"<i>");
		p.flush();
		p.close();
	}

}
