package OverLoading;

public class Triangle extends Square{

	public int getArea(Square s){
		int area = (s.L)*(s.B);
		return area;
	}
	
}
