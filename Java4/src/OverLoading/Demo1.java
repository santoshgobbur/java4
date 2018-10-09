package OverLoading;

public class Demo1 {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		d1.employeeSale(15);
		int x = d1.employeeSale(0);
		System.out.println(x);
		String y = d1.employeeSale("Hi");
		System.out.println(y);
		String z= d1.employeeSale("hi", 15);
		System.out.println(z);
		
		Demo1 hbd = new Demo11();
		hbd.employeeSale();
		
}
	public int employeeSale(char q){
		
		System.out.println("No argument method");
		System.out.println("parent class method");
		return q;

	}
    public int employeeSale(int a){
    	
		//System.out.println("With int argument method");
        return a;
    }
    
	public String employeeSale(String s){
		
		//System.out.println("With string argument method");
		return "hello";
	}
	
	public String employeeSale(String s, int b){
		
		//System.out.println("With string argument method");
		return s;
	}
	
	public void employeeSale(){
		System.out.println("Parent class method");
	}
}

	class Demo11 extends Demo1{
		
		public void employeeSale(){
			
			System.out.println("Child class method");
			
		}
	}


