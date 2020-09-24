package com.abc;

import java.util.function.Predicate;
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Predicate<User> p = u -> u.username.equals("durga") && u.pwd.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String username = sc.next();
		System.out.println("Enter Password:");
		String pwd = sc.next();
		User user = new User(username, pwd);
		if (p.test(user)) {
			System.out.println("Valid user and can avail all services");
		} else {
			System.out.println("invalid user you cannot avail services");
		}
	}
}
