package OverLoading;

public class S2 {

	public static void main(String[] args) {

		S2 obj2 = new S2();
		obj2.qwe("j");
		obj2.qwe(new Object());
		obj2.qwe(null);
		obj2.qwe('c');
		obj2.qwe(20);
			
	}

	 public void qwe(String s){
		  
		 System.out.println("String Method");
	 }
	 
	 public void qwe(Object O){
		  
		 System.out.println("Object method");
	 }
}
