package com.scp.rtp;

public class R3 {

	public static void main(String[] args) {
    
		R4 r4 = new R4();
		r4.disp();
		R3 r5 = new R3();
		r5.disp();
		R3 r3 = new R4();
		r3.disp(); 
	}
	
	public static void disp(){
		System.out.println("R3 static");
	}
	private void dipl(){
		System.out.println("R3 private");
	}
	public final void drl(){
		System.out.println("R3 final");
	}

}
class R4 extends R3{
	
	public static void disp(){
		System.out.println("R4 static");
	}
	private void dipl(){
		System.out.println("R4 private");
	}
	
}