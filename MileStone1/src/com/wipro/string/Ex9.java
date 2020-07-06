package com.wipro.string;
import java.util.*;
public class Ex9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		if(s.length()==s1.length()) {
		for(int i=0;i<s.length();i++) {
				System.out.print(""+s.charAt(i)+s1.charAt(i));
		}
		}
	}
}
