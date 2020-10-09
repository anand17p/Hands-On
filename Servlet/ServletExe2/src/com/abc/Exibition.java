package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exibition extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Exibition() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1 style='color:green;'  align='center'>TextFair 2018 expo</h1>");
		pw.println(
				"<div align='center'><table border=1><tr><th>Name</th><td>TextFair 2017 expo</td></tr><tr><th>Hall Name</th><td>PVR Superplex</td></tr><tr><th>Start Date</th><td>10-10-2020</td></tr><tr><th>End Date</th><td>10-10-2030</td></tr></table></div>");
		pw.println("");

	}

}
