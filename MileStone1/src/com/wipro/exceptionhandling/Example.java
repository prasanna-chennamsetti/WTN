package com.wipro.exceptionhandling;
import java.util.*;
public class Example {
	static int division(int a,int b)throws ArithmeticException{
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println(division(a,b));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
