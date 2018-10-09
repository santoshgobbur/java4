package com.scp.colllection;

import java.util.Comparator;
import java.util.HashMap;
//import java.util.HashSet;
//import java.util.NavigableMap;
//import java.util.Set;
import java.util.TreeSet;

public class Col2 {

	public static void main(String[] args) {
		
		TreeSet s = new TreeSet();
		s.add(10);
		s.add(20);
		s.add(4);
		s.add(785);
		System.out.println(s);
	
		HashMap m1 = new HashMap();
		m1.put(10, "A");
		m1.put(20, "B");
		System.out.println(m1);
		
	//Set s = m1.keySet();
		System.out.println(m1.size());
	System.out.println(s);

     }
}
 //class X1 implements Comparator{
	 
	// public int compare(Object ob1,Object ob2){
		// Integer i1 = (Integer)ob1;
		 //Integer i2 = (Integer)ob2;
		 
		 //if(i1<i2){
			// return +1;
		// }
		 //else if(i1>i2){
			// return -1;
		 //}
		 //else{
			// return 0;
		// }
//	 }
 //}
