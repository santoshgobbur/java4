package OverLoading;

public class S4 {

	public static void main(String[] args){
		
		S4 obj4 = new S4();
		obj4.wer(10);
		obj4.wer(10,20);
		obj4.wer(10);
    
	}
	
	public void wer(int x){
		System.out.println("int method");
	}
	public void wer(int ... x){
		System.out.println("int arg method ");
	}
}
