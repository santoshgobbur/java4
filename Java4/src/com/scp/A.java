package com.scp;

interface A {
	public void printHello();


}
interface S{
	public void printHello();
}
class c1 implements A,S{

	public static void main(String[] args) {
		
		c1 obj1 = new c1();
		A ts = (A)obj1;
		ts.printHello();
		obj1.printHello("ho");
		obj1.printHello();
	//	ts.printHello("gi");
		
		A ref = new c1();
		ref.printHello();
		Integer i = new Integer(4);
		
		A ts2 = (A)obj1;
	}
	public void printHello(){
		System.out.println("hello from A");
	}
	public void printHello(String s){
		System.out.println("hello from S");
	}
}
