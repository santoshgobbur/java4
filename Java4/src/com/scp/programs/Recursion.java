package com.scp.programs;

public class Recursion {
	
	String rev = "";
	
	public static void main(String[] args) {
        
		
		// way 1
		Recursion rec = new Recursion();
		System.out.println("Result : " +rec.reverseString("hello"));
      	
		
		//way 2
		String s = "How";
		char[] c= s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--){
			
			System.out.println(c[i]);
			
		}
		
		
		
		// way 3
		StringBuffer d =  new StringBuffer("hat");
		System.out.println(d.reverse());            
		
		//way 4
		
		    String input = "For";
	        char[] temparray = input.toCharArray();
	        int left, right=0;
	        right = temparray.length-1;
	 
	        for (left=0; left < right ; left++,right--)
	        {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right]=temp;
	        }
	 
	        for (char c1 : temparray){
	            System.out.print(c1);
	       // System.out.println();
	    }	
		
	}
   
	public String reverseString(String str){
		
		if(str.length()==1){
			return str;
		}
		else{
			rev = str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length()-1));
			return rev;
		}
		
	}
}
