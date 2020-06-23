package com.wipro.string;

public class Ex1 {
	public static void main(String[] args) {
		String s="seas";
		String r="";
		int n=s.length();
		int f=0;
		for(int i=n-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		if(s.equals(r)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
