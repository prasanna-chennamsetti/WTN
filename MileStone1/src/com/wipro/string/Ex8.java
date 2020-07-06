package com.wipro.string;
import java.util.*;
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				String s1=s.replace(s.charAt(i),' ');
				String s2=s1.replace(s.charAt(i-1), ' ');
				String s3=s2.replace(s.charAt(i+1),' ');
				System.out.println(s3);
			}
		}
	}
}
