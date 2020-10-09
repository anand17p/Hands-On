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
		pw.println("<h1 style='color:green;'  align='center'>Welcome to Popular Paradise</h1>");
		pw.println(
				"<div align='center'><a href ='./servlet2' >Exibition</a><br><a href ='./servlet3'>Stage Show</a></div>");
		pw.println("");

	}

}
