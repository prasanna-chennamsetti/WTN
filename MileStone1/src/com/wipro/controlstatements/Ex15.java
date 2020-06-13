package com.wipro.controlstatements;
import java.util.*;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i=0,j;
		n=sc.nextInt();
			for(i=0;i<n;i++) {
				for(j=0;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println(" ");
			}
		}

}
