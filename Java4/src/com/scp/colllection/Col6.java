package com.scp.colllection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Col6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ArrayList <String>al = new ArrayList<String>();
		al.add("15");
		al.add("S");
		al.add("2");
		al.add("P");
		
		ArrayList al2 = new ArrayList();
		
		al2.add(1);
		al2.add("G");
		System.out.println(al2);
		
	/*	System.out.println(al.get(2));
		System.out.println(al.indexOf("S"));
	    System.out.println(al.indexOf("G"));
	    System.out.println(al.indexOf("HJ")); */
	     al.add(1, "R"); 
	     System.out.println(al);
	    System.out.println( al.contains("R"));
		
		Iterator itr1 = al.iterator();
		
		while(itr1.hasNext()){
	
			System.out.println(itr1.next());
		}
	} 

}
