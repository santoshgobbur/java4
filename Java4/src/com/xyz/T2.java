package com.xyz;

import com.scp.S1;

public class T2 extends S1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S1 s1 = new S1();
	  //  s1.print();
	 T2 t2 = new T2();
	 t2.caller();
		

	}
	public void caller(){
		S1.print();
	}

}
