package com.scp;

public class TestAbstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Shape obj1 = new Rectangle();
		Shape obj2 = new Circle();
		obj1.draw();
		obj2.draw();
		obj1.Use();
	}

}

abstract class Shape{
	 abstract void draw();
	 
	 void Use(){
		 System.out.println("anything");
	 }
}

class Rectangle extends Shape{
	
	public void draw(){
		System.out.println("draw rectangle");
	}
	
	void Use (){
		System.out.println("anything rectangle");
	}
}

class Circle extends Shape{
	
	public void draw(){
		System.out.println("draw circle");
	}
}
