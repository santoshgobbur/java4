package Overriding.in;

class Case_1 {

	public static void main(String[] args) {
		
		Case_1 p = new Case_1();
		p.marry();
		p.property();
		
		C c  = new C();
		c.marry();
		c.property();
		
		Case_1 m = new C();
		m.marry();
		m.property();
   }

   public void property()
   {
	   System.out.println("cash,land,gold");
   }
   
   public void marry(){
	   
	   System.out.println("old generation");
   }
}
   
   class C extends Case_1
   {
	  public void marry(){
		  System.out.println("new generation");
	  }
   }
   
