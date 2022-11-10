package com.ciq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeDeleteController
 */
@WebServlet("/delete")
public class EmployeeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDeleteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		
		response.setContentType("text/html");
		int Empolye_id = Integer.parseInt(request.getParameter("eid"));
		// service 
		service.delete(Empolye_id);
		request.setAttribute("delete", Empolye_id);
		p.println(Empolye_id);
		p.print("SUCESSFULLY INSERTED");
		p.print("<a href='index.jsp'>home page</a>");
		p.close();
	}

}
