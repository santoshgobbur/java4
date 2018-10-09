package com.scp.PgmExecution;

public class A {
	
	static int a1;
	int a2;
	static String a3 = "Hi";
	
	static {
		System.out.println("A's Staic block");
		System.out.println(a1);
		System.out.println(a3);
	}
	
	{
		System.out.println("A's instance block");
		System.out.println(a2);
	}
	
	void disp(){
		System.out.println("A's instance method");
	}
	A(){
		System.out.println("A's constructor block");
		int i=15;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		}
}
