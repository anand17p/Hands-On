package com.abc47;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String customerName;
		Integer price;
		List<TicketBooking> list = new LinkedList<TicketBooking>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of customers");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for (int i = 0; i < eno; i++) {
			String str = br.readLine();
			String[] details = str.split(",");
			customerName = details[0];
			price = Integer.parseInt(details[1]);
			TicketBooking t = new TicketBooking(customerName, price);
			list.add(t);

		}
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));

	}
}
