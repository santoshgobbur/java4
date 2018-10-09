package com.scp.colllection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C1 {

	public static void main(String[] args) {
     
		/*
		Set s1 = new HashSet<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("d");
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			 
			String i = (String)itr.next();
			System.out.println(i);
		}	
		if(itr.equals("d")){
			itr.remove();
		}*/
		
	  List al = new ArrayList<>();
	  al.add(1);
	  al.add(2);
	  al.add(3);
	  al.add(4);
	  
	  Iterator itr1 = al.iterator();
	  
	  while(itr1.hasNext()){
		  
		  Integer I = (Integer)itr1.next();
		  //System.out.println(I);
		  
		  if(I%2==0){
			  System.out.println(I);
		  }
		  else{
			  itr1.remove();
		  }
	  }
	}
}
