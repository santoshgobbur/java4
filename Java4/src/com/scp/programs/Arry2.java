package com.scp.programs;

import java.util.HashMap;

public class Arry2 {
	
	public static void main(String[] args) {
		
		 int[] a = {1,2,3,4,5,6};
		 int[] b = {6,5,4,15,16,7};
		 int[] c = {10,5,10,3,2,5,10};
		 
		 HashMap<Integer,Integer> h2 = new HashMap<Integer,Integer>();
		 
		 for(int j=0;j<c.length;j++){
			 if(h2.containsKey(c[j])){
				 h2.put(c[j],h2.get(c[j])+1);
			}
			 else{
				 h2.put(c[j],1);
			 }
			 
		 }
		 System.out.println(h2);
		 
		 HashMap h1 = new HashMap();
		 
		    for(int i=0;i<a.length;i++){
		    	
		    	for(int j=0;j<b.length;j++)
		    	{
		    		if(a[i]==b[j]){
		    			System.out.println(a[i]);
		    			
		    		}
		    
		    	}
	     }
		    
		   for(int i=0;i<a.length;i++){
			   
			   for(int j=i+1;j<a.length;j++){
				   if(a[i]+a[j]==9){
					   h1.put(a[i],a[j]);
				   }
			   }
		   }
		   System.out.println(h1);
		  
    }
}
