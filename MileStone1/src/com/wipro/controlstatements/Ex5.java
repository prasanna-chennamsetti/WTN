package com.wipro.controlstatements;

public class Ex5 {
	public static void main(String[] args) {
		char a='#';
		if(a>='a' && a<='z') {
			System.out.println("Alphabet");
		}
		else if(a>=0 && a<=9) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special character");
		}
	}

}
