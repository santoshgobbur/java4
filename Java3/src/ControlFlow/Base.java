package ControlFlow;

public class Base {
	
	static int i=15;
	
	static{
		m1();
		System.out.println("base static block");
	}
  
	public static void main(String[] args) {
		m1();
		System.out.println("base main");
	}
	 public static void m1(){
		 System.out.println(j);
	 }
	 static int j=24;
}

class Derived extends Base{
	
	static int x=2;
	
	static {
		m2();
		System.out.println("derived first static block");
	}
	
	public static void main(String[] args) {
		m2();
		System.out.println("derived main");
	}
	
	public static void m2(){
		System.out.println(y);
	}
	
	static {
		System.out.println("derived second static block");
	}
	static int y=5;
}
