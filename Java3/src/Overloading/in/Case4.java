package Overloading.in;

public class Case4 {

	public static void main(String[] args) {
		
		Case4 t = new Case4();
		t.m4(0);
		t.m4(10);
		t.m4(10,20);
		t.m4(10,1,2,3,4);
	}
	
	public void m4(int x){
		
		System.out.println("general method");
	}
	
	public void m4(int... x){
		
		System.out.println("var-arg method");
	}

}
