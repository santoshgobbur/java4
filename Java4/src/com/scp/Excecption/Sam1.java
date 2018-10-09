package com.scp.Excecption;

public class Sam1 {

	public static void main(String[] args) {
		
		Sam1 s1 = new Sam1();
		System.out.println(s1.returnValue());
		
}
   
	 int returnValue(){
		
		try{
		   System.out.println(10/0);
		   return 15;
		}
		
		catch(ArithmeticException e){
			System.out.println(10/2);
			return 1;
        }
	
		finally {
		     System.out.println("finally block executed");
	         return 16;
	      //   System.out.println("fgi"); ---- CTE : Unreachable code
		  } 
	//	System.out.println("gi"); ---- CTE : Unreachable code
	
	}
}
