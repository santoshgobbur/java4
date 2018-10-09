package com.scp.programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
  
		int result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter number ");
		int number = sc.nextInt();
		
		result = (number/2)*2;
		
		//if(result==number)
		if(number%2==0)	
		{
			System.out.println("Entered number "+number+" is even number" );
		}
		else{
			System.out.println("Entered number "+number+" is odd number" );
		}
		
	}

}
