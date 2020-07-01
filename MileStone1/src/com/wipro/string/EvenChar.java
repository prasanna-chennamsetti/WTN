package com.wipro.string;

import java.util.Arrays;

public class EvenChar {
	public static void main(String[] args) {
		String s="ZxPUa";
		char c=' ';
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0) {
				c=s.charAt(i);
			System.out.print(c);
		}
		}
		int a[]= {1,5,3,8,6};
		Arrays.sort(a);
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
}
