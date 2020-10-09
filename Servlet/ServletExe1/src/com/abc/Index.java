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
		pw.println("<html>");
		pw.println("<head><title>Welcome</title></head>");
		pw.println("<body >");
		pw.println("<h1 style='color:DeepPink;'  align='center'>Welcome to the Hall Paradise</h1>");
		pw.println("<p align='center'>The type of events are</p>");
		pw.println("<div align='center'><ul style=' list-style:inside; border:1px solid black; width:15% ;text-align:left'><li>Exibition</li><li>Stage Show</li></ul></div>");
		pw.println("</body></html>");
	}

}
