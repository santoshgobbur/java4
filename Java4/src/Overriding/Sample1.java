package Overriding;

public class Sample1 {

	public static void main(String[] args) {
		
		Sample1 s1 = new Sample1();
		Sample2  s2 = new Sample2();
		Sample1 hbd = new Sample2();
		
		hbd.secondMthod("hi");
		hbd.firstMethod();
		hbd.thirdMethod('c');

	}
	
	public void firstMethod(){
		
		System.out.println("Parent class firstMethod");
	}
	
     String secondMthod(String s1){
		
		System.out.println("Parent class secondMethod");
		return s1;
		
	}
	
	protected char thirdMethod(char c1){
		
		System.out.println("parent class charMthod");
		return c1; 
		
	}


}
