package com.scp.programs;

public class Pattern1 {

	public static void main(String[] args) {
     
		int n=3;
		printStars(n);
	}
	
	public static void printStars(int n){
		
	int i,j;
	
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.println("* ");
			}	
			System.out.println();
			
		}

	}

}
