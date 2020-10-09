package com.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Get {
	public static void main(String[] args) throws Exception {
		try {
			String DRIVER = "com.mysql.jdbc.Driver";
			String URL = "jdbc:mysql://localhost:3306/database1";
			String USER = "root";
			String Pwd = "**********";
			Class.forName(DRIVER);
			System.out.println("Driver found");
			System.out.println("Connecting to a database...");
			Connection conn = DriverManager.getConnection(URL, USER, Pwd);
			System.out.println("Connected ");
			Statement stmt = conn.createStatement();

			String sql = "SELECT * FROM  database1.`corona threat table`";
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {

				System.out.println(result.getString("state") + "," + result.getString("district") + ","
						+ result.getInt("male") + "," + result.getInt("female"));

			}
			conn.close();
			result.close();
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}
