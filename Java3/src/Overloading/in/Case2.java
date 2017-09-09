package Overloading.in;

public class Case2 {

	public static void main(String[] args) {
		
		Case2 t = new Case2();
		t.m2("sfr");
		t.m2(new Object());
		t.m2("null");
		
		
	}
	
	public void m2(String s){
		
		System.out.println("string-arg method");
	}
	
	public void m2(Object n){
		
		System.out.println("object-arg method");
	}

}
