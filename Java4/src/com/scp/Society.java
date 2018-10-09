package com.scp;

public abstract class Society {

	public static void main(String[] args) {

		Society s1 = new Local(); // 1st way to call Parent method
		//s1.entryTime();
		//s1.Rules();
		//s1.parkingSlot();
		s1.callerParent();
		
	   Local s4 = new Local(); // 3rd way to call Parent method
	 //  s4.sampleOne();  
		
	   Society s2 = new Outsiders();
		//s2.parkingSlot();
		//s2.Rules();
		
		
	}
	public void Rules(){
		System.out.println("For all");
	}
	public static void entryTime(){
		System.out.println("Society OnTime Obeying");
    }
	public abstract void parkingSlot();
	
	public  void callerParent(){
       Rules();
	}
	

}

class Local extends Society{
	
	public void Rules(){
		System.out.println("Rules of Locals");
	}

	public static void entryTime(){
		System.out.println("Local OnTime Obeying");
	}
	public void sampleOne(){
		super.Rules();
	}
	public void parkingSlot(){
		System.out.println("Local parking");
	}
}
class Outsiders extends Local{
	
    public void Rules(){
		System.out.println("Rules of Outsiders");
	}
	
	public static void entryTime(){
		System.out.println("Outsiders OnTime Obeying");
	}
	public void parkingSlot(){
		System.out.println("Outsiders parking");
	}
	

}
