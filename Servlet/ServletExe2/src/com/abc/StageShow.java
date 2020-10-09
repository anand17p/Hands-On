package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StageShow() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1 style='color:green;'  align='center'>New Yera Eve</h1>");
		pw.println(
				"<div align='center'><table border=1><tr><th>Name</th><td>New Year Eve</td></tr><tr><th>Hall Name</th><td>PVR Lulu Hall</td></tr><tr><th>Start Date</th><td>10-10-2020</td></tr><tr><th>Start time</th><td>10:00:00</td></tr><tr><th>End time</th><td>12:00:00</td></tr></table></div>");
		pw.println("");

	}

}
