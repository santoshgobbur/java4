package com.scp.programs;
// Second Largest number in array and second smallest number in array
public class Arry {

	public static void main(String[] args) {
		
		int[] a1 = {75,61,33,40,97,16,18};
	    System.out.println("number is :" +getSecondLargest(a1, 7));
	}
    public static int getSecondLargest(int[] a, int total){
    	
    	int temp;
    	for(int i=0;i<total;i++){
    		
    		for(int j=i+1;j<total;j++){
    			
    			if(a[i]>a[j])
    			{
    				temp =a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    	}
    	//return a[total-2]; // -- returns second largest number 
    	return a[1]; // ---- returns second smallest number
    }
}
