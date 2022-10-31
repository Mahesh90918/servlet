package myDynamicWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Hi extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		// Write the text with help of PrintWriter
		PrintWriter pr = resp.getWriter();
		pr.println("<html>");
		pr.println("<body>");
		pr.println("<h1> Hi extends GenericServle</h1>");
		pr.println("<h2> Welcome to Servlet mahesh</h2>");
		pr.println("<body>");
		pr.println("<html>");
		pr.flush();
		pr.close();

	}

}
