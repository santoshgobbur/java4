package com.scp.Abstraction;

public abstract class Ab {
	
	int a=10;
	int b=12;
 /*	Ab(int q,int r){
		this.a=a;
		this.b=b;
	} */
	
	void T(int a){
		System.out.println("dfd");
	}
	void T(float b){
		System.out.println("s");
	}
	void T(char b){
		System.out.println("char");
	}
}

class B extends Ab{
	
	String s="hi";
	int p=8;
	int q=9;
	char v='d';
	public static void main(String[] args) {
		
		B c =  new B("h");
		B c1 = new B(5,5);
		B c2 = new B('c');
		c.T('c');
	
	}
	
	B(char c){
  	  //  super(4,5);
		this.v =v;
	}
	
   B(String e){
	//   super(4,50);
	   this.s=s;
	   
   }
   B(int f,int d){
	 //  super(5,8);
	   this.p=p;
	   this.q=q;
   }

}
