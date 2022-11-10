package com.ciq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.ems.model.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeUdateController
 */
@WebServlet("/update")
public class EmployeeUdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeUdateController() {
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
		response.setContentType("text/html");
		int eid = Integer.parseInt(request.getParameter("eid"));
		EmployeeServiceImpl impl = new EmployeeServiceImpl();
		Employee emp = impl.getById(eid);
		request.setAttribute("empolyee", emp);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		int eid = Integer.parseInt(request.getParameter("eid"));
		// String eid=request.getParameter("eid");
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		// String esal=request.getParameter("esal");
		String email = request.getParameter("email");
		// service
		EmployeeServiceImpl ser = new EmployeeServiceImpl();
		Employee employee = new Employee(eid, ename, esal, email);
		ser.update(employee);
		request.setAttribute("msg", "record updated successfully!");
		request.getRequestDispatcher("/findall").forward(request, response);
		p.print("SUCCESSFULLY UPDATED");
		p.print("<a href='index.jsp'>home page</a>");
		p.flush();
		p.close();
	}

}
