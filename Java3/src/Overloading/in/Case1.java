package Overloading.in;

public class Case1 {

	public static void main(String[] args) {
          
		Case1 t = new Case1();
		t.m1(10);
		t.m1(2.4f);
		t.m1('s');
		t.m1(10l);
		//t.m1("feds");
		//t.m1(new Object());

	}
	
	public void m1(int i){
		System.out.println("int-arg method");
		
	 }
	public void m1(float i){
		System.out.println("float-arg method ");
	}

}
