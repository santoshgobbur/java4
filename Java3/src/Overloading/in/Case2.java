package Overloading.in;

public class Case2 {

	public static void main(String[] args) {
		
		
	
		
   }
	
     class F {
	  	
		public void method1(){
			System.out.println("class C's method1");
			
		}
		public void method2(){
			System.out.println("class C's method2");
		}
	}
	class D extends F {
		public void method3(){
			System.out.println("class D's method1");
		}
		public void method4(){
			System.out.println("class D's method2");
	    }
	}
}
