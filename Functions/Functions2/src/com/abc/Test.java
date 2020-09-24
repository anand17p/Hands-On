package com.abc;

import java.util.function.*;

class Test {
	public static void main(String[] args) {
		String s = "durga software solutions hyderabad";
		Function<String, String> f = s1 -> s1.replaceAll(" ", "");
		System.out.println(f.apply(s));
	}
}
