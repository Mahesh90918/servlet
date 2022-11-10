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
		// request.setAttribute("emps", list);
		// request.getRequestDispatcher("list_data.jsp").forward(request, response);
		p.println("<table border='1px'>");
		p.print("<tr><th>EID</th><th>ENAME</th><th>ESAL</th><th>EMAIL</th></tr>");
		p.println("<tr>");
		p.println("<th>" + "EID" + "</th>");
		p.println("<th>" + "Ename" + "</th>");
		p.println("<th>" + "Esalary" + "</th>");
		p.println("<th>" + "Email" + "</th>");
		p.println("</tr>");
		for (Employee employee : list) {
			p.println("<tr>");
			p.println("<td>" + employee.getId() + "</td>");
			p.println("<td>" + employee.getName() + "</td>");
			p.println("<td>" + employee.getSalary() + "</td>");
			p.println("<td>" + employee.getEmail() + "</td>");
			p.println("</tr>");
		}
		p.println("</table >");
		p.println("<a href='index.html' >index</a>");
		// p.print("<a href='index.html'>home</a>");
		p.flush();
		p.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
