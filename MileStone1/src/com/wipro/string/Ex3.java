package com.wipro.string;
import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		String s1=s.substring(0,2);
		for(int i=0;i<s.length();i++) {
			System.out.print(s1);
		}
	}
}
