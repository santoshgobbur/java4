package test1.scp.com;

public class Class1 {

	public static void main(String[] args) 
	{
		
		P c = new P();
		c.m();
	}
	
	class P
	{
		public Object m(){
			return null;
			//System.out.println("method 'm' inside class P");
		}
	}
   
	class S extends P
	{
		public String m(){
			return null;
			//System.out.println("method 'm' inside class S");
		}
	}
}
