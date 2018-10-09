package com.scp.Excecption;

public class Sam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = new Sam5().absorbeTheValue();
		
		Sam5 s5 = new Sam5();
		System.out.println(s5.absorbeTheValue());
	}

	int absorbeTheValue() {
	    try {
	           System.out.println("hi");
	        	//return 4;
	        }
	     catch(Exception e) {
	        return 45;
	    } 
	   finally {
	        return 34;
	    }
	  //  return 15;
	}    
}
