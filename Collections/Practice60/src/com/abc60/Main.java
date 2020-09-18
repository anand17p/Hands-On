package com.abc60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String name;
		long mobilenumber;
		String username;
		String password;
		ArrayList<User> list = new ArrayList<User>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of user details");
		int eno = Integer.parseInt(br.readLine());
		for (int i = 0; i < eno; i++) {
			System.out.println("Enter the user details "+(i+1) );
			String str = br.readLine();
			String[] details = str.split(",");
			name = details[0];
			mobilenumber = Long.parseLong(details[1]);
			username = details[2];
			password = details[3];
			User e = new User(name, mobilenumber, username, password);
			list.add(e);
		}
		System.out.println("The user details in reverse order:");
		System.out.println("Name"+"\t"+"MobileNumber");
		Collections.reverse(list);
			for (User h : list) {
				System.out.println( h.name+"\t"+ h.mobilenumber);
			}
		}
}
