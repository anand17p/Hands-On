package com.abc;

class DeadLock implements Runnable {
	A a = new A();
	B b = new B();

	DeadLock() {
		Thread t = new Thread(this);
		t.start();
		a.foo(b);
	}

	public void run() {
		b.bar(a);
	}

	public static void main(String[] args) {
		new DeadLock();
	}
}
