package com.scp.programs;

public class Fibonaci {

	public static void main(String[] args) {
		
		int[] b = {1,2,3,4,5};
		b[0] = 1;
		b[1] = 2;
		for(int j=2;j<=4;j++){
        	
        	b[j] = b[j-1]+b[j-2];
        	
        }
        for(int j : b){
        	System.out.println(j);
        }
		//int count= 10;
		int[] a = new int [10];
		a[0] = 15;
		a[1] = 16;
		
		
		for(int i=2; i<10; i++){	 
		  a[i] = a[i-2]+a[i-1];	
		}
		for (int i:a){
			System.out.println(i);
		}
	}

}
