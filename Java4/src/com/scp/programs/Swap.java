package com.scp.programs;

import java.util.HashMap;
import java.util.Set;

public class Swap {

	public static void main(String[] args) {
        
		int x = 15;
		int y = 16;
		System.out.println("X and Y before swapping respectively : "+x+" "+y+" ");
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println(x);
		System.out.println(y);
		
		String s="rama";
		char[] c = s.toCharArray();
		
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		
		for(int i=0;i<c.length;i++){
			if(h.containsKey(c[i])){
				h.put(c[i],h.get(c[i])+1);
			}
			else{
				h.put(c[i],1);
			}
		}
		System.out.println(h);
		
		Set<Character> q = h.keySet();
		
	    System.out.println(q);
		
		for(Character l:q){
			if(h.get(l)>1){
				System.out.println(l+"-->"+h.get(l));
			}
			else
				System.out.println(l+"-->"+h.get(l));
		}
	
	  for(int i=0;i<s.length();i++){
		  for(int j=i+1;j<s.length()-i;j++){
			  String q1 = s.substring(i, i+j);
			  System.out.println(q1);
		  }
	  }
		
	}
}
