package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Index() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1   align='center'>User Details</h1>");
		pw.println("<html>\r\n" + 
				"<body >\r\n" + 
				"<div align='center'>\r\n" +
				"	<form action=\"Register\" method=\"post\">\r\n" + 
				"\r\n" + 
				"		Name:<input type=\"text\" name=\"userName\" /><br />\r\n" + 
				"		<br /> Phone Number:<input type=\"text\" name=\"userPhone\" /><br />\r\n" + 
				"		<br /> Email :<input type=\"text\" name=\"userEmail\" /><br />\r\n" + 
				"		<br /> City: <input type=\"text\" name=\"userCity\"><br />\r\n" + 
				"		<br /> <input type=\"submit\" value=\"register\" />\r\n" + 
				"\r\n" + 
				"	</form>\r\n" +
				"</div>\r\n" +
				"</body>\r\n" + 
				"</html>");
	}

}
