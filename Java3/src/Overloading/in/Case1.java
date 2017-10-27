package Overloading.in;

public class Case1 {

	public static void main(String[] args) {
          
		Case1 t = new Case1();
		t.m1(10);
		t.m1(2.4f);
		t.m1('s');
		t.m1(10l);
	    t.m1("santosh");
	   
		//t.m1("feds");
		//t.m1(new Object());

	}
	
	public void m1(int i)
	{
		System.out.println("int method");
		
	 }
	public void m1(float i)
	{
		System.out.println("float method ");
	}
 //  private void m1(String name)
//   {
//	   System.out.println("string method");
//   }
   public int m1(String f)
   {
	   System.out.println("return type method");
	   return 0;
   }
}
