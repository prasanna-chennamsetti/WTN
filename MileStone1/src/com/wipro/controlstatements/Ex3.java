package com.wipro.controlstatements;

public class Ex3 {
	public static void main(String[] args) {
		int n=args.length;
		if(n==0) {
			System.out.println("No values");
		}
		else {
			for(int i=0;i<n-1;i++) {
				System.out.print(args[i]+",");
			}
			System.out.print(args[n-1]);
		}
	}

}
