package com.abc58;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String no = "";
		List<List<Integer>> l1 = new ArrayList<List<Integer>>();
		List<Integer> l2 = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the count of booked tickets:");
		int no1 = Integer.parseInt(br.readLine());
		for (int i = 0; i < no1; i++) {
			System.out.println("On Day " + (i + 1));
			String str = br.readLine();
			String[] details = str.split(",");
			l2.add(100 - (Integer.parseInt(details[0])));
			l2.add(100 - (Integer.parseInt(details[1])));
			l2.add(100 - (Integer.parseInt(details[2])));
			l2.add(100 - (Integer.parseInt(details[3])));
		}
		while (true) {
			System.out.println("Enter the day to know its remaining ticket count:");
			int no2 = Integer.parseInt(br.readLine());
			System.out.println("Remaining tickets:" + l2.subList(4 * (no2 - 1), 4 * no2));
			System.out.println("Do you want to continue?(y/n)");
			no = br.readLine();
			if (no.equals("n")) {
				break;
			}

		}
	}
}
