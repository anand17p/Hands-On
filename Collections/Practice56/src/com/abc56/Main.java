package com.abc56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args)throws NumberFormatException, IOException  {
		String username	;
		String addressLine1;
		String addressLine2;
		Integer pinCode	;
		ArrayList<Address> list = new ArrayList<Address>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of users:");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		for (int i = 0; i < eno; i++) {
			String str = br.readLine();
			String[] details = str.split(",");
			username = details[0];
			addressLine1 = details[1];
			addressLine2 = details[2];
			 pinCode = Integer.parseInt(details[3]);
			Address e = new Address(username,addressLine1,addressLine2,pinCode);
			list.add(e);
		}
		Collections.sort(list);
		for (Address e : list) {
			System.out.println(e.username+","+e.addressLine1+","+e.addressLine2+","+e.pinCode);

		}

	}

}
