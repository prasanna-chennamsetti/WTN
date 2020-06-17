package com.wipro.classesandobjects;

public class Calculator {
	static void powerInt(int num1,int num2) {
		int c=(int) Math.pow(num1, num2);
		System.out.println(c);
	}
	static void powerDouble(double num1,int num2) {
		double d=(double)Math.pow(num1,num2);
		System.out.println(d);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.powerInt(2, 3);
		c.powerDouble(5.0,2);
	}

}
