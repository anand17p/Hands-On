package com.abc;

import java.util.function.Predicate;

class Test {
	public static void main(String[] args) {
		String[] names = { "Sunny", "Kajal", "Mallika", "Katrina", "Kareena" };
		Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
		System.out.println("The Names starts with K are:");
		for (String s : names) {
			if (startsWithK.test(s)) {
				System.out.println(s);
			}
		}
	}
}
