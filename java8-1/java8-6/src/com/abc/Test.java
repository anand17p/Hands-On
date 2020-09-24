package com.abc;

public class Test {
	int x = 10; 
	public void m2() {
		int y = 20; 
		Interf i = () ->{ 
			System.out.println(x); 
			System.out.println(y); 
			x = 888; 
			//y = 999; 
			}; 
			i.m1(); 
			//y = 777; 
			} 
	public static void main(String[] args) { 
		Test t = new Test(); 
		t.m2();
		}
	}

