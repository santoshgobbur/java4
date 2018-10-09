package com.scp.PgmExecution;

 class B extends A {
	
	static String b1;
	int b2;
	
	static {
		System.out.println("B's first staic block");
		System.out.println(b1);
	}
	
	{
		System.out.println("B's first insatnce block");
		System.out.println(b2);
	}
    
    B(){
		System.out.println("B's constructor");
	}
	
}
 class C extends B {
	 
	 static {
		 System.out.println("C's static block");
	 }
	 {
		 System.out.println("C's instance block");
	 }
	 C(){
		 System.out.println("C's constructor block");
	 }
	 
 }
 