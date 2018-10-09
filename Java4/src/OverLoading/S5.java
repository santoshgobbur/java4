package OverLoading;

public class S5 {

	public static void main(String[] args) {
		
       S5 obj5 = new S5();
       obj5.fun(10,10.5f);
       obj5.fun(10.5f,10);
       
            
	}
	public void fun(int i,float f){
		System.out.println("int-float combination");
	}
	public void fun(float f,int i){
		System.out.println("float-int combination");
	}
	

}
