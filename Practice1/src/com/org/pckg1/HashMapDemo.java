package com.org.pckg1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Object ,Object>h = new HashMap <Object,Object>();
		
		h.put(101, "lara");
		h.put(101, "santosh");
		h.put(102, "sama");
		
	System.out.println(""+	h.containsKey(101));
		System.out.println(h);
		Set s = h.keySet();
		System.out.println(s);
		 Collection c = h.values();
		 System.out.println(c);
		 
		 
		 LinkedHashMap hs =  new LinkedHashMap();
		 
		 String str = "abs";
		 System.out.println(str.hashCode());
		 String st = new String("abc");
		 
		 StringBuffer  ss = new StringBuffer("wrong"); 
		 System.out.println(ss.hashCode());
		 System.out.println(ss.offsetByCodePoints(0,4));
		 
		 StringBuffer s1 = new StringBuffer("core java");
		 
		 String d = str.concat(st);
		 System.out.println("d print"+d);
		 
		// String st1= st.concat(ss);
		 
		 StringBuffer st2 = ss.append(str);
		 
		 
		 
		 System.out.println(""+str+""+st);
		 
		 
		Hashtable<String, String> hg = new Hashtable<String, String>();

		hg.put("101", null);
		hg.put("102", "k");
		System.out.println(hg);
		
		
		
	}

}
