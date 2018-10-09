package com.scp;

public class L {

}
interface left{
	public void m1();
	int x =15;
	
}
interface right{
	public void m1();
	int x=16;
}

class L1 implements left,right{
	
	public void m1(){
		
	}
	public static void main(String[] args) {
		System.out.println(left.x);
		System.out.println(right.x);
	}
	
	
}