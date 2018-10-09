package com.scp.rtp;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		R2 p = new R2();
		R_2 c = new R_2();
		R2 hbd = new R_2();
	
		/* Static methods
		p.printM(); ----- parent method executed
		c.printM(); ----- child method executed
		hbd.printM(); --- parent method executed (Method hidding)
		
		*/
		
		/*private methods
p.printMS(); ---- parent method executed
hbd.printMS();---parent method executed bcoz called method is not available to child class
		*/
		
		//hbd.printHi();
		
		//hbd.printM();
		//hbd.printMS();
		
	}

	 public static void printM(){
		 System.out.println("printM R2");
	 }
	 public final void printMS(){
		 System.out.println("printMS R2");
	 }
	 public void printHi(){
		 System.out.println("parent hi");
	 }
}

class R_2 extends R2{
	
	 public static void printM(){
		 System.out.println("printM R_2");
	 }
	/* public final void printMS(){
		 System.out.println("printMS R_2");
	 } */
	 public void printHi(){
		 System.out.println("child hi");
	 }
	
}