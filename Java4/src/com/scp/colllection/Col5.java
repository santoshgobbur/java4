package com.scp.colllection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class Col5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashMap hp = new HashMap();
          hp.put("SG", 15);
          hp.put("SSG",16);
          System.out.println(hp);
                   
          Collection c = hp.values();
          System.out.println(c);
          
          Set s1 = hp.entrySet();
          System.out.println(s1);
          Iterator s2 = s1.iterator();
          
          while(s2.hasNext()){
              
        	  Map.Entry e = (Map.Entry)s2.next();
        	  System.out.println(e);
         
          } 
          
        
	}

}
