package com.abc;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Validate extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String event = request.getParameter("eventname");
		String hall = request.getParameter("hallname");
		String details = request.getParameter("details");
		String owner = request.getParameter("owner");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		PrintWriter pw = response.getWriter();
		pw.println("<h1  align='center'>Event Details</h2><br/>");
		pw.println("<table border='1' align='center'>");
		pw.println("<tr>");
		pw.println("<th>Event Name</th><td>" + event + "</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Hall Name</th><td>" + hall + "</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Details</th><td>" + details + "</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Owner</th><td>" + owner + "</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>Start Date</th><td>" + startdate + "</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<th>End Date</th><td>" + enddate + "</td>");
		pw.println("</tr>");
		pw.println("</table>");

	}

}