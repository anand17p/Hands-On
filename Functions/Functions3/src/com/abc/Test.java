package com.abc;

import java.util.function.*;

class Test {
	public static void main(String[] args) {
		String s = "durga software solutions hyderabad ";
		Function<String, Integer> f = s1 -> s1.length() - s1.replaceAll(" ", "").length();
		System.out.println(f.apply(s));
	}
}
