package com.wipro.arrays;
import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,min=9999,max=0;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Max is :"+max+" Min is : "+min);
	}
}
