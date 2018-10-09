package com.scp.ctp;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=15;
		int g=1;
		int ssg;
		ssg = s+g;
		System.out.println(ssg);

	}

}
class D_3 extends D2{
	
}
class D4 extends D2{
	
}
 interface A{
	 
	int pri();
	
  }
 class D5 implements A{
	 public int pri(){
		 int a;
		 int b=15;
		 int c =1;
		 a = b+c;
		 System.out.println(a);
		 return a;
	 }
	
 }