package OverLoading;

public class S3 {

	public static void main(String[] args) {
		
		S3 obj3 = new S3();
		obj3.m1("ss");
		obj3.m1(new StringBuffer ("ss"));
	//	obj3.m1(null); Check Compile Time Error
		
	}
	
	public void m1(String s){
		 System.out.println(" String version method");
		 
	}
	public void m1(StringBuffer sb){
		 System.out.println("StringBuffer version method");
	}

}
