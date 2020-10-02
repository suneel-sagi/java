package java;

import java.util.Scanner;

public class SecondLargestArrayNumber {
 
	public static void main(String[] args) {
	int a[]= {25,26,29,5};
	System.out.println(a);
	}
	public static int secondlargestnum(int[] a,int b) {
		int c;
		for(int i=0;i<b;i++) {
			for(int j=i+1;j<i;j++) {
				if(a[i]>a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		return a[b-2];
	}
}
