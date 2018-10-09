package com.scp.colllection;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C2 {

	public static void main(String[] args) {
     
		//TreeSet t1 = new TreeSet(new myComparator());
 
	    Set t1 = new TreeSet();
		t1.add(2);
		t1.add(47);
		t1.add(10);
		t1.add(5);
		t1.add(16);
		t1.add(1);
		System.out.println(t1);

	}
    
	class myComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Integer i1 =(Integer)o1;
			Integer i2 =(Integer)o2;
			
			if(i1<i2){
				return 15;
			}
			else if(i1>i2){
				return -15;
			}
			else
			return 0;
	  }
   }
}