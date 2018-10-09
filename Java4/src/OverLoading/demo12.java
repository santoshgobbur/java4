package OverLoading;

public class demo12 {

	int x;
	int y;
	public demo12(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println(""+x+" "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 demo12 d = new demo12(10, 12);
	}

}
