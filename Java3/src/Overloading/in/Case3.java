package Overloading.in;

public class Case3 {

	public static void main(String[] args) {
		
		Case3 t = new Case3();
		
		t.m3(10.5f,5);
		t.m3(5, 50.1f);
		//t.m3(10, 10);
		//t.m3(10.5f, 5.5f);
	}
	
	public void m3(int a, float b){
		
		System.out.println("int -float version method");
	}
	
	public void m3(float a, int b){
		
		System.out.println("float-int version method");
	}

}
