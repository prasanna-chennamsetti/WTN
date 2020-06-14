package com.wipro.arrays;

public class Ex6 {
	public static void main(String[] args) {
		int a[]= {1,5,2,7,4};
		int i,n=a.length,temp=0;
		for(i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
