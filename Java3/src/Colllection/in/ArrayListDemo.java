package Colllection.in;

import java.util.ArrayList;

class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"S");
		System.out.println(l);

	}

}
