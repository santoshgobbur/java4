package com.scp.programs;

import java.util.Scanner;
import java.util.Stack;

public class RevesreWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] aStr = str.split(" ");
		Stack<String> reverseOrder = new Stack<>();
		for(String s: aStr) {
		reverseOrder.push(s);
		}
		StringBuilder sb = new StringBuilder();
		while(!reverseOrder.isEmpty()){
		sb.append(reverseOrder.pop()).append(" ");
		}
		//System.out.println(reverseOrder);
		System.out.println(sb.toString());
	}
}
