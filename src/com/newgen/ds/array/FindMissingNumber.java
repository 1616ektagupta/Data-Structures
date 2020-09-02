package com.newgen.ds.array;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,3,6};
		
		int result = findMissing(arr,6);
		
		System.out.println(result);

	}

	private static int findMissing(int[] arr, int n) {
		
		int a = arr[0];
		int b = 1;
		
		for(int i=1 ; i<arr.length; i++){
			a = a ^ arr[i];
			System.out.println("value of a : " + a);
		}
		
		for(int i=2 ; i<=n; i++){
			b = b ^ i;
			System.out.println("value of b : " + b);
		}
		
		return a ^ b;
	}

}
