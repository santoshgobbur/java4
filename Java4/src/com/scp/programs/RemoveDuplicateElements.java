package com.scp.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		String[] s = new String[]{"a","b","c","a"};
		int [] c = {10,15,16,9,10,15};
		char [] p = {'f','g','s','p','f'};
		String v = "heloo";
		char[] c1 = v.toCharArray();
		Set a = new HashSet<>();
		Set b = new HashSet<>();
	
		// remove duplicate
		for(char d:c1){
			
			if(!a.contains(d)){
				a.add(d);
			}
			else{
				b.add(d);
			}
		}
		//System.out.println(s.toString());
		System.out.println(a);
		System.out.println(b);
	
		for(int i=0;i<p.length;i++){
			for(int j=i+1;j<p.length;j++){
				if(p[i]==p[j]){
					System.out.println(p[j]);
				}
			}
		}
		/*
		// count of duplicate
		Map<Character,Integer> h2 = new HashMap<Character,Integer>();
		
		for(char z:c1){
			if(h2.containsKey(z))
			{
				h2.put(z, h2.get(z)+1);
				
			}
			else{
				h2.put(z, 1);
			}
		}
		System.out.println(h2);
		HashMap<Character,Integer> h3 = new HashMap<Character,Integer>();
		
		for(int i=0;i<p.length;i++)
		{
			if(h3.containsKey(p[i]))
			{
				h3.put(p[i], h2.get(p[i])+1);
				
			}
			else{
				h3.put(p[i], 1);
			}
		}
		System.out.println(h3);
		
		System.out.println(h2);
		Set<Character> keys = h2.keySet();
		for(Character c3:keys){
			if(h2.get(c3)>1){
				System.out.println(c3+"-->"+h2.get(c3));
			}
		}*/
		
	}

}
