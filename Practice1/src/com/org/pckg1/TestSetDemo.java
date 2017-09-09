package com.org.pckg1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TestSetDemo {

	public static void main(String[] args) {
	
	TreeSet t = new TreeSet(new MyComparator());
	
	t.add("A");
	t.add("z");
	t.add("K");
	t.add("B");
	t.add("a");
	System.out.println(t);

	TreeSet<String> t2 = new TreeSet<String> ();
	t2.add("D");
	t2.add("g");
	t2.add("A");
	t2.add("D");
	t2.add("22");
	System.out.println(t2);
	
	TreeSet<String> t3= new TreeSet<String> ();
try{
	t3.add(null);
	
t3.add("A");
	System.out.println(t3);
}
catch(NullPointerException npe)
{
	System.out.println(""+npe.getMessage());
	npe.getClass();
	
}
/*finally 
{
	System.out.println("realesed the resource");
}*/
 //Set s = new Set ();
 //s.add("A");
 
 
	}

}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2){
		
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		
		return -s1.compareTo(s2)	;
	}

	

	}


