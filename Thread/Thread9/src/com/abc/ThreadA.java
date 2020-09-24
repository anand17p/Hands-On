package com.abc;

class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("main Thread calling wait() method");// step-1
			b.wait();
			System.out.println("main Thread got notification call");// step-4
			System.out.println(b.total);
		}
	}
}
