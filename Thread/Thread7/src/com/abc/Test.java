package com.abc;

public class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		// t.interrupt(); 1
		System.out.println("end of main thread");
	}
}
