package com.wipro.wrapperclass;

public class Ex2 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		System.out.println("Binary : "+Integer.toBinaryString(n));
		System.out.println("Otal : "+Integer.toOctalString(n));
		System.out.println("Hexa : "+Integer.toHexString(n));
	}
}
