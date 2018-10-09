package com.scp.colllection;

import java.util.ArrayList;
import java.util.Iterator;

public class Col8 {
//	 String obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("hi");
		//al.add(3, "hi");
		al.add("15");
		//System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
		 String I =(String)itr.next();
		  System.out.println(I);
		}
		
	} 

}
