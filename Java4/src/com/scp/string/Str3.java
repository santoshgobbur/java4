package com.scp.string;

public class Str3 {
     private  String s;
     int y=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Str3 st3 = new Str3("6");
       Str3 st31 =new Str3("S");
       Test x1 = new Test();
       x1.printValue();
       
       System.out.println(st3);
       System.out.println(st31);
       
       Test k = new Test(15);
       System.out.println(k);
	}
	Str3(){
		
	}
	Str3 (String a){
		this.s = a;
	}
 	public String toString(){
		return s+ " ";
	} 
}
 class Test {
	 int x;
	 Test(){
		 
	 }
	 Test(int i){
		 this.x = i;
	 }
	 public String toString(){
			return x+ " ";
		}
	 public void printValue(){
		 System.out.println(x);
	 }
	 
 }

