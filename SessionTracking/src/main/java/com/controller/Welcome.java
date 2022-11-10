package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		
		Cookie[] c = request.getCookies();
		//p.print("Hello "+c[0].getValue() +"name" +c[0].getName());  
		for (int i = 0; i < c.length; i++) {
			//System.out.println(c[i].getValue());
			p.println("<br>"+c[i].getName() + "  " + c[i].getValue());
		}

//		HttpSession ses = request.getSession();
//		String s = (String) ses.getAttribute("user");
//		p.println(s + "<br>");

		

		p.println("<br>" + "login success" + "<br>");
		p.println("<br>" + user + "<br>");
		p.println("<br>" + pass + "<br>");

		
		
		
		p.println("<a href='logout.html'>logout</a>");
		p.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
