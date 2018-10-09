package OverLoading;

public class Square {
	
	int L;
	int B;

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Square s1 = new Square();
    Triangle s2 = new Triangle();
    s1.setL(15);
    s1.getL();
    s1.setB(15);
    s1.getB();
    System.out.println(s1.getL());
    int area =s2.getArea(s1);
    System.out.println("Area is "+area);
	
	}
	

}
