package com.scp.ctp;

 interface D1 {
	  void Print();
	  void Say();
 }
 class D3 implements D1{
	 
	 public void Print(){
		 System.out.println("Hello");
	 }
	 public void Say(){
		 System.out.println("say it");
	 }
 	
  public static void main(String[] args){
	   
	D3 obj = new D3();
	obj.Print();
	
	D1 obj2 = new D3();
	obj2.Say();
  }
 
 } 