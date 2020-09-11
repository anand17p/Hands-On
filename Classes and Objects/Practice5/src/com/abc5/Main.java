package com.abc5;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,IOException {
		String name;
		long runs;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ExtraType e = new ExtraType();
			System.out.println("Enter the ExtraType details");
			String str = input.readLine();
			String details[] = str.split("#");
			name=(details[0]);
			runs=Long.parseLong(details[1]);
			e.setName(name);
			e.setRuns(runs);
		    System.out.println("ExtraType details ");
			System.out.println("ExtraType:"+e.getName());
			System.out.println("Runs :"+e.getRuns());
		}
	}
		


