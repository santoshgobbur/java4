package OverLoading;

public class S1 {

	public static void main(String[] args) {
		
		S1 obj1 = new S1();
		obj1.fun1(10);
		obj1.fun1(10.5f);
		obj1.fun1('c');
		obj1.fun1(10l);
		// obj1.fun1(10.5); Compile Time Error
	
		
}
      public void fun1(int i ){
		
		System.out.println("int method");
		
		
	}
    public void fun1(float i ){
		
		System.out.println("float method");
		
	}
  
}


