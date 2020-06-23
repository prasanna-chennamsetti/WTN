package com.wipro.overloading;
class Fruit {
	String name;
	String size;
	String taste;
	void eat() {
		System.out.println("Fruit and Taste");
	}
}
class Apple extends Fruit{
	void eat() {
		System.out.println("Apple and Sweet");
	}
}
class Orange extends Fruit{
	void eat() {
		System.out.println("Orange and salty with sweet");
	}
}
public class Ex1 {
	public static void main(String args[]) {
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
	}
}
