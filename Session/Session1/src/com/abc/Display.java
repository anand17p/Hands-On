package com.abc;

import java.io.*;
import javax.servlet.http.*;

public class Display extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			HttpSession session = request.getSession(false);
			String n = (String) session.getAttribute("ename");
			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Display</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"<div align='center'>\r\n" + 
					"<h1>Event Management System</h1>\r\n"+
					"	<b><font>Event "+n+" is planned to held on 2018-09-05 in Rudolfinum</font></b>\r\n"+ 
					"</body>\r\n" + 
					"</body>\r\n" + 
					"</html>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
