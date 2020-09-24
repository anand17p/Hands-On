package com.abc;

class DaemonThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		System.out.println("end of main Thread");
	}
}
