package com.scp.programs;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString="";
		Scanner in = new Scanner(System.in);
		System.out.println("enter input String");
		inputString = in.nextLine();
		
		int i;
		int begin=0;
		int end = inputString.length()-1;
		int middle = (begin+end)/2;
		
		for(i=begin;i<=middle;i++){
			
			if(inputString.charAt(begin)==inputString.charAt(end)){
				begin++;
				end--;
			}
			else{
				break;
			}
		}
		
		if(i==middle+1){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
			
	}

}
