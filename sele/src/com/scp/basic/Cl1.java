package com.scp.basic;

public class Cl1{
	static int x=0;
	public static void main(String[] args) {
	System.out.println("hi");
	Cl1 cl2 = new Cl1();
	System.out.println(cl2.x);

	}
    class Cl2 extends Cl1{
	public int m(){
		System.out.println(x);
	}
    }
    
    
	
	
	
