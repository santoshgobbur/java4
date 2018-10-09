
package com.scp.programs;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SubString {

	public static void main(String[] args) {
 
		String subString1;

		String s1 = "hello";
	
		//Substring
		for(int i=0; i<s1.length();i++){
			
			for(int j=i+1; j<=s1.length()-i;j++){
				
		      subString1 = s1.substring(i,i+j);
		      System.out.println(subString1);
		      
			}
		}
	
		// duplicate chars in string
		
		char[] a=s1.toCharArray();
		for(int i=0;i<s1.length();i++){
			for(int j=i+1;j<s1.length();j++){
				if(a[i]==a[j])
				{
					System.out.println("duplicate chars "+a[j]);

				}
			}
		} 
		
		// count of occurances of chars in string 
	
		HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();
		char[] ch = s1.toCharArray();
	
		for(int i=0;i<ch.length;i++){
				if(h2.containsKey(ch[i])){
					h2.put(ch[i], h2.get(ch[i])+1);
					
			    }
				else{
					h2.put(ch[i],1);
				}
		}
		System.out.println(h2);
		
        Set<Character> ket = h2.keySet();
 
        for(Character c:ket){
        	if(h2.get(c)>1){
        		System.out.println(c+"-->"+h2.get(c));
        	}
        	else{
        		System.out.println(c+"-->"+h2.get(c));
        	}
        }
	}

}
