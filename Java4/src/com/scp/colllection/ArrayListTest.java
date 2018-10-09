package com.scp.colllection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(15);
		al.add(4);
		al.add(16);
		al.add(2);
		
		for(int x:al){
			System.out.println("before sort :"+x);
		}
		Collections.sort(al);
		for(int x:al){
			System.out.println(" After sort :"+x);
		}
		

	}
	

}
