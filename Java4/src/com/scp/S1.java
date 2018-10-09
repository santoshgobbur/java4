package com.scp;

/*public class S1 {

     static int x=15;
     protected static void print(){
    	 System.out.println("cfdv");
     } */
     
  class D extends S1{
	 
	  public static void main(String[] args) {
		
		  S1 obj = new S1();
		//  obj.print();
		  
		  D d =new D();
		  d.caller1();
		  
	}
	  
	  public void caller1(){
		  super.print();
	  }
  }
  public class S1 {

	     static int x=15;
	     protected static void print(){
	    	 System.out.println("cfdv");
	     }
  }
