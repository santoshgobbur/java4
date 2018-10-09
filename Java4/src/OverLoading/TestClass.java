package OverLoading;

public class TestClass {

	public static void main(String[] args) {
         
		SecondClass ref2 = new SecondClass();
		ref2.Afternoon();
		ref2.Morning();
		ref2.Evening();
		
		ThirdClasss ref1 = new ThirdClasss();
		ref1.Afternoon();
		ref1.Morning();
		ref1.Evening();
		ref1.Holiday();
		
		SecondClass ts = new ThirdClasss();
		ts.Afternoon();
		ts.Evening();
	    ts.Morning();
	    ts.Holiday();

		
	//	TestClass ref = new TestClass();
	//	ref.method();
	//	ref.method(12);
	//	ref.method(15);
	//	ref.method("S");
		
	}
   
	public void method(){
		System.out.println("print method1");
	}
	
	public void method(int a){
		System.out.println("print int");
	}
	public void method(String s){
		System.out.println("print string");
	}
	public void method(double f){
		System.out.println("print float ");
	}

}

