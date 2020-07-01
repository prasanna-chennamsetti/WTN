package com.wipro.string;
import java.util.*;
public class Ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		if(n%2==0) {
			System.out.println(s.substring(0,n/2));
		}
		else {
			System.out.println("null");
		}
	}
}
