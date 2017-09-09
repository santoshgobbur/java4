package exception.handle.com;

public class Demo1 {

	public static void main(String[] args) {
		
		dostuff();
		System.out.println("hello");

	}
	
	public static void dostuff(){
		
		domorestuff();
		System.out.println("hi");
	}
	
	public static void domorestuff(){
		
		System.out.println(10/0);
		System.out.println("hello");
	}

}
