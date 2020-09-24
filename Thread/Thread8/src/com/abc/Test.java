package com.abc;

public class Test {
	public static void main(String[] args) {
		Display d1 = new Display();
		MyThread t1 = new MyThread(d1, "dhoni");
		MyThread t2 = new MyThread(d1, "yuvaraj");
		t1.start();
		t2.start();
	}

}
