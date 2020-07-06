package com.wipro.string;
import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i,f=1;
		String s1=" ",s2=" ",s3=" ";
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				s1=s.substring(0,i-1);
				s2=s.substring(i+1);
			}
		}
		for(i=0;i<s1.length();i++) {
			if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
				f=0;
			}
			else {
				f=1;
			}
		}
		if(f==0) {
			System.out.println(s1+""+s2.substring(1));
		}
		else {
			System.out.println(s1+""+s2);
		}
	}
}
