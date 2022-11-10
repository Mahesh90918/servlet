package com.ciq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.model.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmpolyeeGetAll
 */

@WebServlet("/findall")
public class EmpolyeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpolyeeFindAllController() {
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
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		List<Employee> list = emp.findAll();
		request.setAttribute("empolyee", list);
		request.getRequestDispatcher("list_data.jsp").forward(request, response);
		p.flush();
		p.print("SUCCESSFULLY FIND ALL DATA");
		p.print("<a href='index.jsp'>home page</a>");
		p.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
