package com.scp.programs;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
 
	String rev="";
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter original string");
	String original = sc.nextLine();
	
	for(int i=original.length()-1;i>=0;i--){
		
		 rev = rev + original.charAt(i);
	}
	if(original.equals(rev)){
		System.out.println("Entered String is palindrome");
	}
	else{
		System.out.println("Entered String is not palindrome");
	}
	
	}

}
