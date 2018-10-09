package com.scp.programs;

import java.util.HashMap;
import java.util.Set;

public class CharCountInStirng {
	
	
	static void elementCountArray(int[] b)
    {
        //Creating a HashMap containing char as a key and occurrences as  a value
 
        HashMap<Character, Integer> charCountMap1 = new HashMap<Character, Integer>();
 
        //Converting given string to char array
 
        for(int i=0;i<b.length;i++){
        
        	char[] c2 = String.valueOf(b[i]).toCharArray();
 
        //checking each char of strArray
 
       for (int j=0;j<c2.length;j++)
        {
 
            if(charCountMap1.containsKey(c2[j]))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
                charCountMap1.put(c2[j],charCountMap1.get(c2[j])+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap1.put(c2[j],1);
            }
        }
 
       }
        //Printing the charCountMap
 
        System.out.println(charCountMap1);
    }
 
	static void characterCount(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as  a value
 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
        //Converting given string to char array
 
        char[] strArray = inputString.toCharArray();
 
        //checking each char of strArray
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
                charCountMap.put(c, 1);
            }
        }
 
        //Printing the charCountMap
 
        System.out.println(charCountMap);
    }
	 
	static void elementCountString(String[] s1){
		
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		
	   for(int i=0;i<s1.length;i++){
		   char[] c3 = String.valueOf(s1[i]).toCharArray();
		   
		   for(int j=0;j<c3.length;j++){
			   
			   if(h.containsKey(c3[j])){
				   h.put(c3[j], h.get(c3[j])+1);
			   }
			   else{
				   h.put(c3[j],1);
			   }
		   }
	   }
	
	}
  
    public static void main(String[] args)
    {
    //	int[] a = {15,17,64,67};
    //	String[] s = {"a","b","c","b","c","a"};
    	characterCount("Hello2jovo");
    //	elementCountArray(a);
    	//elementCountString(s);
    }
}


