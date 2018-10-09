package com.scp;

 interface Company {
	
	public void getEmployeeId();
	public void getEmployeeAge();
	public void getEmployeeSalary();
	
}
 interface Client{
	 public void getEmployeeSalary();
	 
 }

class I implements Client,Company {
	
	   public void getEmployeeId(){
		System.out.println("Get the Id");
	}
	   public void getEmployeeAge(){
		   System.out.println("Get the Age");
	   }
	   public void getEmployeeSalary(){
		   System.out.println("Get the salary of I");
	   }
	
	public static void main(String[] args) {
        
		  J a = new J();
		  a.getEmployeeId();
		  a.getEmployeeName();
		  a.getEmployeeSalary();
		  
		}
}
 class J extends I {
	 
	   public void getEmployeeId(){
		System.out.println("Get the Id J");
	}
	 
	 public void getEmployeeAge(){
		 
		 System.out.println("Get the age J");
	 }
	 public void getEmployeeName(){
		 System.out.println("get name");
	 }
	 public void getEmployeeSalary(){
		   System.out.println("Get the salary of J");
	   }
	
	 
 }

