package com.wipro.string;

public class Case {
	public static void main(String[] args) {
		String s="Hello Welcome";
		char s1,s2;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				s1=Character.toLowerCase(c);
				System.out.print(s1);
			}
			else {
				s2=Character.toUpperCase(c);
				System.out.print(s2);
			}
		}
	}

}
