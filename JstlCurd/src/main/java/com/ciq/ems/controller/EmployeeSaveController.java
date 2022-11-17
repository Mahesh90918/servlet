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
 * Servlet implementation class EmployeeSaveController
 */
@WebServlet("/save")
public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeSaveController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		String email = request.getParameter("email");
		// service
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		Employee employee = new Employee(eid, ename, esal, email);
		service.save(employee);
		writer.print("SUCCESSFULLY SAVE");
		writer.print("<a href='index.jsp'>home page</a>");
		writer.close();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter p = response.getWriter();
//		EmployeeServiceImpl emp = new EmployeeServiceImpl();
//		List<Employee> list = emp.findAll();
//		request.setAttribute("empolyee", list);
//		request.getRequestDispatcher("list_data.jsp").forward(request, response);
//		p.flush();
//		p.close();
	}

}
