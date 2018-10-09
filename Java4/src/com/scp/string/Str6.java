package com.scp.string;

public class Str6 {

	String reverse="";
	
    public static void main(String[] args){
    	
		Str6 str6 = new Str6();
		System.out.println("Result : " +str6.reverse("hello"));
	}
	
	public String reverse(String str){
		
		if(str.length()==1){
			return str;
		} 
		else{
			reverse = str.charAt(str.length() - 1) + reverse(str.substring(0, str.length()-1));
			return reverse;
		}
			
	}

}
