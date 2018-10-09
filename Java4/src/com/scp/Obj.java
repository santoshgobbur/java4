package com.scp;

public class Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			abc s=new abc();
			s.m1(s);
	}

}

class abc{
	
	int x=10;
	String y="aa";
	
	public void m1(abc s)
	{
		System.out.println("values of x and y are: "+s.x+s.y);
		
	}
}


