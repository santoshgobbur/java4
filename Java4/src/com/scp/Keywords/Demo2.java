package com.scp.Keywords;

public class Demo2 implements C {
	
private	int id;
int id2=15;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getS() {
		return s;
	}
	public static void setS(int s) {
		Demo2.s = s;
	}
	static int s = 15;

	public static void main(String[] args) {
  
		//Demo2 d = new Demo2();

	}

	static{
		
		System.out.println("static");
	//	Demo2 d = new Demo2();
		//System.out.println(id2);
		System.out.println();
		
	} 
	public void showInstance(){
		System.out.println(id);
		System.out.println(s);
		System.out.println(id2);
	}
	{
	  System.out.println(s);
	 
	}
	public void Hi(){
		System.out.println("sd");
	}
	public void Hell(){
		System.out.println("djghjd");
	}
}

abstract class S extends Demo2{
	
}
interface A{
	public void Hi();
}
interface B{
	public void Hell();
}
interface C extends A,B{
	
}
