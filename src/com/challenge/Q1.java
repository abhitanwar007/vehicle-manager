package com.challenge;

public class Q1 {
	public static void main(String[] args) {
		int a[]= {6,5,2,1,7,8};
		System.out.println(secondMax(a));
	}
	// create a method called secondMax
	
	private static int secondMax(int[] a) {
		int l=a.length;
		int temp;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			// after sort first 2 number break the loop
			if (i==1) {
				break;
			}
		}
		return a[1];
	}
}
