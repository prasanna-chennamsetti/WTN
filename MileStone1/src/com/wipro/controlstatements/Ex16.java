package com.wipro.controlstatements;

public class Ex16 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		while(n!=0) {
			int a=n%10;
			System.out.print(a);
			n=n/10;
		}
	}

}
