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
		pw.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Event Page</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<div align='center'>\r\n" + 
				"<h1>Event Management System</h1>\r\n"+
				"	<form action=\"servlet1\">\r\n" + 
				"		Event Name:<input type=\"text\" name=\"eventName\" /><br><br /> \r\n" + 
				"		<input type=\"submit\" value=\"Go\" />\r\n" + 
				"	</form>\r\n" + 
				"</body>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
