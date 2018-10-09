package com.scp.colllection;

import java.util.HashMap;

public class Col1 {

	public static void main(String[] args) {
         
		HashMap m = new HashMap();
		m.put("B", 1);
		m.put("C", 1);
		m.put("B", 3);
	   // System.out.println(m);
		
		Integer i1 = new Integer(15);
	    Integer i2 = new Integer(17);
	    Integer i3 = new Integer(16);
	  
	  //  System.out.println(i1);
	    m.put(i1, "hi");
	    m.put(i2, "hello");
	    m.put(i3,"bye");
	    System.out.println(m);
	   
	//   System.out.println(i1.equals(i2));
	//   System.out.println(i1.equals(i3));
	//   System.out.println(m);
		
		
	}

}
