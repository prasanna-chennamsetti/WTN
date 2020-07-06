package com.wipro.string;
import java.util.*;
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(s.substring(s.length()-3));
		}
	}
}
