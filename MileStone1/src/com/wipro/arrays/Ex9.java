package com.wipro.arrays;
import java.util.*;
public class Ex9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]==10) {
				a[i]=0;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
