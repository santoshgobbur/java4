package com.xyz;

public class X implements Y,Z {

	public static void main(String[] args) {



	}
	public void m1(){
		System.out.println("Hi Y");
	}
	public void m2(){
		System.out.println("Hi Z");
	}
}
interface Y {
	public void m1();
}
interface Z{
	public void m2();
}
