package exception.handle.com;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("statement one");
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e )
		{
			System.out.println(10/2);
		}
		System.out.println("statement second");
		
	}

}
