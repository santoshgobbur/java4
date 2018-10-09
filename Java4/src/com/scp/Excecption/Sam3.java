package com.scp.Excecption;

public class Sam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sam3 s3 = new Sam3();
		s3.m1();
        System.out.println("helo");
	}

	void m1(){
		try{
			n1();
		}
		catch(ArithmeticException e){
			System.out.println("exception handled");
		}
	}
	void n1() {
		int i = 10/0;
	}
}
