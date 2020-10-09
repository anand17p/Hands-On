package com.abc;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Display extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("userName");
		String p = request.getParameter("userPhone");
		String e = request.getParameter("userEmail");
		String c = request.getParameter("userCity");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "$a$i1272Anand");

			PreparedStatement ps = con.prepareStatement("insert into registeruser values(?,?,?,?)");

			ps.setString(1, n);
			ps.setString(2, p);
			ps.setString(3, e);
			ps.setString(4, c);
			

		    ps.executeUpdate();
			doGet(request,response);
		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "$a$i1272Anand");
			PrintWriter pw = response.getWriter();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from registeruser");
			pw.println("<h1  align='center'>User Details</h2><br/>");
			pw.println("<table border='1' align='center'>");
			pw.println("<tr>");
			pw.println("<th>Name</th><th>Phone Number</th><th>Email</th><th>City</th>");
			pw.println("</tr>");
			while (rs.next()) {
				pw.println("<tr>");
				pw.println("<td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
						+ "</td><td>" + rs.getString(4));
				pw.println("</tr>");
			}
			pw.println("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}