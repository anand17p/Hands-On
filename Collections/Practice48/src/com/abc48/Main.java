package com.abc48;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		String eno = "";
		String no = "";
		while (true) {
			System.out.println("Enter the username " + (i + 1));
			list.add(br.readLine());
			i++;
			System.out.println("Do you want to continue?(y/n)");
			no = br.readLine();
			if (no.equals("n")) {
				System.out.println("The Name entered are:");
				for(String s:list)
				{
					System.out.println(s);
				}
				break;
				
			}
		}
	}
}