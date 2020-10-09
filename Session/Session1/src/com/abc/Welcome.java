package com.abc;

import java.io.*;
import javax.servlet.http.*;

public class Welcome extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("eventName");
			HttpSession session = request.getSession();
			session.setAttribute("ename", n);

			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Welcome</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"<div align='center'>\r\n" + 
					"<h1>Event Management System</h1>\r\n"+
					"	<form action=\"servlet2\">\r\n" + 
					"	<b><font color='green'>Welcome to this event "+n+"</font></b><br><br />\r\n"+ 
					"		<input type=\"submit\" value=\"Get Detail\" />\r\n" + 
					"	</form>\r\n" + 
					"</body>\r\n" + 
					"</body>\r\n" + 
					"</html>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
