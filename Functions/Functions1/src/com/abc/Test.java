package com.abc;

import java.util.function.*;

class Test {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Durga"));
		System.out.println(f.apply("Soft"));
	}
}
