package com.scp;

public abstract class Company1 {

	public static void main(String[] args) {
         
		Company1 c1 = new W();
		c1.getCompanyClient();
		c1.getCompanyName();
		
		W c2 = new W();
		c2.getCompanyName();
	}
	{
		System.out.println("instance block");
	}
	static{
		System.out.println("static block");
	}
	Company1(){
		System.out.println("Constructor");
	}
    public void getCompanyName(){
    	
    	System.out.println("Company1");
    }
    public abstract void getCompanyClient();   
    
}

class Q extends Company1{
	
	public void getCompanyName(){
		System.out.println(" Q Company");
	}
	 public void getCompanyClient(){
		 System.out.println("AT&T");
	 }
}
class W extends Q{
	
	public void getCompayName(){
		System.out.println("W Comapny");
	}
	 public void getCompanyClient(){
		 System.out.println("Verizon");
	 }
	
}