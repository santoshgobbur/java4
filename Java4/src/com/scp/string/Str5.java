package com.scp.string;

public class Str5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
        
         String s5 = new String("you r hero");
         String s6 = new String("you r hero");
         StringBuffer  sb1 = new StringBuffer("gi");
         StringBuffer  sb2 = new StringBuffer("gi");
         System.out.println(sb1==sb2);
         //System.out.println(sb1==sb2);
         //System.out.println(sb1.equals(sb2));
         System.out.println(s5==s6);
         System.out.println(s5.equals(s6));
         
         String s7 = "you r hero";
         System.out.println(s5==s7);
         System.out.println(s5.equals(s7));
	}       

}
