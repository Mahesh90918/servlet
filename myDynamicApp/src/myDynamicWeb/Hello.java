package myDynamicWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	// Write the text with help of PrintWriter
	PrintWriter pr=resp.getWriter();
	pr.println("<html>");
	pr.println("<body>");
	pr.println("<h1> Hello extend to HttpServlet Abstract Class<h1>");
	pr.println("<h2> Welcome to Servlet mahesh</h2>");
	pr.println("<body>");
	pr.println("<html>");
	pr.flush();
	pr.close();
}
}
