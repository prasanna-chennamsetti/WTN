package com.wipro.arrays;

public class Ex5 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int n=a.length;
		int i,max1=a[1],max2=a[1],min1=a[1],min2=a[1];
		for(i=0;i<n;i++) {
			if(a[i]>max1) {
				max1=a[i];
			}
		}
		for(i=0;i<n;i++) {
			if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
			}
		}
		for(i=0;i<n;i++) {
			if(a[i]<min1) {
				min1=a[i];
			}
		}
		for(i=0;i<n;i++) {
			if(a[i]<min2 && a[i]!=min1) {
				min2=a[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(min1);
		System.out.println(min2);
	}

}
