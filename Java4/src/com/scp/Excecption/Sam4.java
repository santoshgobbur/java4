package com.scp.Excecption;

import java.io.IOException;

public class Sam4 {

	public static void main(String[] args) {
         
		Sam4 s4 = new Sam4();
		s4.f3();
		System.out.println("S");
		
	}
    
	void f1()  {
		//throw new ArithmeticException("Hi");
	}
	void f2() {
		f1();
	}
	void f3(){
		try{
			f2();
			//System.out.println(10/0);
			
		}
		finally{
			System.out.println("hi");
		}
	/*	catch (Exception E){
			System.out.println("Hello");
		}*/
	}
}
