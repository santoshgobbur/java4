package test3.pack.com;

public class Test {

	public static void main(String[] args) {
		
		P p1 = new S();
		p1.m(10);
		
}
}

class P
{
	public void m(int x)
	{
		System.out.println("hi");
	}
}
class S extends P
{
	public void m(int... x)
	{
		System.out.println("hello");
	}
}