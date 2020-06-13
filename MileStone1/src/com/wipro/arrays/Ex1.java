package com.wipro.arrays;
import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int s=0,i;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int avg;
		for(i=0;i<n;i++) {
			s+=a[i];
		}
		avg=s/n;
		System.out.println("Sum is : "+s+"Avg is : "+avg);
		sc.close();
	}

}
