package com.scp.Keywords;

public class Demo1 {
	
	 int i=15;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public static void main(String[] args) {
             		
         
        // System.out.println(i);
        Demo1 obj1 = new Demo_1();
        System.out.println(obj1.getI());
     //    Demo_2 obj2 = new Demo_2();
	}

    static {
    	System.out.println("static parent");
    }
    {
    	System.out.println("instance block");
    }
  
  //  Demo1(){
   // 	System.out.println("Parent constr");
   // }
  
 
}

	class Demo_1 extends Demo1{
		
		Demo_1(){
			System.out.println("Child constr");
		}
		static{
			System.out.println("static child");
		}
		
		{
			System.out.println("I?nstance");
		}
	}

