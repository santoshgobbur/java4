package com.scp.programs;

import java.util.HashMap;
import java.util.Set;

public class CountOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,8,8,9,6,4};
	    String s = "hello2java";  
		HashMap<Integer,Integer> countMap1 = new HashMap<Integer,Integer>();
		HashMap<Character,Integer> countMap2 = new HashMap<Character,Integer>();
         
		char[] ch = s.toCharArray();
		
			for(int i=0;i<a.length;i++){
				if(countMap1.containsKey(a[i])){
					countMap1.put(a[i], countMap1.get(a[i])+1);
				}
				else{
					countMap1.put(a[i],1);
				}
				
			}
		//}
		System.out.println(countMap1);
		
		for(int i=0;i<ch.length;i++){
			if(countMap2.containsKey(ch[i])){
				countMap2.put(ch[i], countMap2.get(ch[i])+1);
			}
			else{
				countMap2.put(ch[i],1);
			}
			
		}
		System.out.println(countMap2);
		
		Set<Character> ket = countMap2.keySet();
        for(Character c:ket){
        	if(countMap2.get(c)>1){
        		System.out.println(c+"-->"+countMap2.get(c));
        	}
       }
	}
}
 

