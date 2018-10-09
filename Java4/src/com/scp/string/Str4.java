package com.scp.string;

public class Str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="a";
		System.out.println(s1.equals("A"));
		System.out.println(s1.equalsIgnoreCase("A"));
		
		
		String s2 ="a";
		System.out.println(s1);
		System.out.println(s2);
		
		String s = new String("Hi");
		StringBuffer sb = new StringBuffer("Hello");
	//	String p =s.concat("Durga");
		sb.append("Durga");
		System.out.println(s);
	//	System.out.println(p);
		System.out.println(sb);
	}


}
