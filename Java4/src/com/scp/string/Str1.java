package com.scp.string;

public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s1 = "Hi";
		String s2 = new String("Hi");
		String s5 =s2.intern();
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
	//	System.out.println(s1==s2);
	//	System.out.println(s1.equals(s2));
			
		StringBuffer s3 = new StringBuffer("Hi");
		StringBuffer s4 = new StringBuffer("Hi"); // conversion of string into stringbuffer
	//	System.out.println(s4.reverse());
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s3));
		System.out.println(s3==s4);
		StringBuilder s6 = new StringBuilder("hello");
		
	}

}
