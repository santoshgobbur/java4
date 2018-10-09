package com.scp.programs;

import java.util.HashSet;

public class Arry1 {

	public static void main(String[] args) {
      
		/*
		int[] a = {15,5,6,7,4,15,1};
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					System.out.println(a[i]); 
		
				}
				
			}
			
		}*/
		char[] c = {'a','b','a'};
		
	/*	for(int i=0;i<c.length;i++){
			
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					System.out.println(c[i]);
				}
				else{
					System.out.println(c[j]);
				}
			}
		}*/
		
        HashSet s1 = new HashSet();
        HashSet s2 = new HashSet();
        
        for(char b:c){
        	if(!s1.contains(b)){
        		s1.add(b);
        	}
        	else{
        		s2.add(b);
        	}
        }
        System.out.println(s1);
        System.out.println(s2); 
	}
}


	   
	   

	
