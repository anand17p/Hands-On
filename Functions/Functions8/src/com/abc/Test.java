package com.abc;

import java.util.function.*;

class Test {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i + i;
		Function<Integer, Integer> f2 = i -> i * i * i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}
}
