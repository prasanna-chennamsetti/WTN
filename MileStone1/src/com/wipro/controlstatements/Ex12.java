package com.wipro.controlstatements;

public class Ex12 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int f=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				f=1;
			}
		}
		if(n==1) {
			System.out.println("Neither prime nor composite");
		}
		else if(f==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
	}

}
