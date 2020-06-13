package com.wipro.controlstatements;

public class Ex17 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int x=n;
		int a,r=0;
		while(n!=0) {
			a=n%10;
			r=r*10+a;
			n=n/10;
		}
		if(x==r) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
