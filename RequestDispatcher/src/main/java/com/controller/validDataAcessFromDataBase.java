package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class validDataAcessFromDataBase
 */
public class validDataAcessFromDataBase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public validDataAcessFromDataBase() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection connection = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");

			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			String user = request.getParameter("userName");
			String password = request.getParameter("password");

			String quary = "select * from validDetails where user_name=? and pass_word=?";
			pre = connection.prepareStatement(quary);
			pre.setString(1, user);
			pre.setString(2, password);

			rs = pre.executeQuery();

			if (rs.next()) { // user valid ------> welcome
				request.setAttribute("output", rs);
				ServletContext sc = getServletContext();
				RequestDispatcher rd = sc.getRequestDispatcher("/welcome");
				rd.forward(request, response);
			} else {
				writer.println("<p style='color:red;'> Your entered Wrong Credetails</p>");
				writer.println(
						"<img src='C:\\Users\\user\\Downloads\\Wrong-Logo.png' text-align='left' width='200px' height='100px' >");
				writer.println(" INVALID DETAILS");

				RequestDispatcher rd = request.getRequestDispatcher("index.html");

				rd.include(request, response);
				// include shows the this else content
				// rd.forward(request, response);

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pre.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
