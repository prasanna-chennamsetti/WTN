package com.wipro.overloading;
class Shape
{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing triangle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing square");
	}
	void erase() {
		System.out.println("Erasing square");
	}
}
public class Ex2 {
	public static void main(String args[]) {
		Circle c=new Circle();
		c.draw();
		c.erase();
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		Square s=new Square();
		s.draw();
		s.erase();
	}
}
