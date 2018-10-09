package Overloading.in;

public class Case1 {

	public static void main(String[] args) {
	
		A a = new A();
		B b = new B();
		A ab = new B();
		ab.method2();
		
	 }
	}
	class A {
		
		private void method1(){
			System.out.println("class A's method1");
			
		}
		public void method2(){
			System.out.println("class A's method2");
		}
		public void method3(){
			System.out.println("class A's method3");
	}
		public void method4(){
			System.out.println("class A's method4");
		}
	}
	
			
	class B extends A {
		
		public void method1(){
			System.out.println("class B's method1");
		}
		public void method2(){
			System.out.println("class B's method2");
	}
	} 


