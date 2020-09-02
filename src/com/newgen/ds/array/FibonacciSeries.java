package com.newgen.ds.array;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10;
		int a[] = new int[n];
		
			a[0] = 0;
			a[1] = 1;
			
		for(int i=2 ; i<n ; i++){
			a[i] = a[i-2] + a[i-1]; 
		}
		
		System.out.print("Fibonacci Series is :" );
		for(int k=0; k<a.length; k++){
			System.out.print(a[k] + " ");
		}
		System.out.println("");
	}
}
