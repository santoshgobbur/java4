package com.scp.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
         
	 int number, fact = 1;	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number : ");
	 
	 number = sc.nextInt();
	 
	 if (number<=0){
		 System.out.println("number should be non-negative");
	 }
	 else
	 {	 
	   for (int c=1; c<number; c++)
	   {
		 
		 fact = fact*c;
	   }
	 }
	 System.out.println("factorial of "+number+" is " +fact);
	}
}
