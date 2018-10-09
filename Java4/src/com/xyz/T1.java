package com.xyz;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	  String str1 = new String("hi1");
	  String str2 = new String("hi");
     System.out.println(str1.equals(str2)); 
     System.out.println(str1==str2);
      
	  
      String str3 = "hi1";
	  String str4 = "hi";
	  
	  String str5 = str1.intern();

	  //System.out.println(str3.equals(str4)); 
      //System.out.println(str3==str4);
	
      System.out.println(str3.equals(str1)); 
      System.out.println(str3==str2);
      System.out.println(str3==str1);
      System.out.println(str1==str5);
      System.out.println(str5.equals(str1));
      System.out.println(str5==str3);
      
	}	
}
