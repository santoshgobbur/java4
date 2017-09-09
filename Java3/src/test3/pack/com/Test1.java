package test3.pack.com;

public class Test1 {

	public static void main(String[] args) {
		
		P1 p = new P1();
		System.out.println(p.x);
		
     	S1 s = new S1();
		System.out.println(s.x);
		
		P1 p1 = new S1();
		System.out.println(p1.x);

	}
}

class P1
{
	int x=888;
} 
class S1 extends P1
{
	int x=999;
}
