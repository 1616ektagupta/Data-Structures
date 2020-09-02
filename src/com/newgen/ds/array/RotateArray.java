package com.newgen.ds.array;

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = {10,3,4,12,5,7,15,12,10};		//10,3,4,12,5,7 	//15,12,10
		int r = 3;									//7,5,12,4,3,10, 	10,12,15
		int n = arr.length;							//15,12,10,10,3,4,12,5,7
		
		//divide array into two parts n & n-r
		rotate(arr,r,n);
	}

	private static void rotate(int[] arr, int r, int n) {
		
		int part1[] = new int[n-r];
		int part2[] = new int[r];
		
		for(int i=0; i<n-r ; i++){
			part1[i] = arr[i];
		}
		for(int i=n-r; i<n ; i++){
			part2[i-(n-r)] = arr[i];
		}
		
		part1 = reverse(part1);
		part2 = reverse(part2);
		
		for(int i=0; i<part1.length ; i++){
			arr[i] = part1[i];
		}
		for(int i=0; i<part2.length ; i++){
			arr[i+(n-r)] = part2[i];
		}
		
		arr = reverse(arr);
		
		System.out.print("Reversed array is :" );
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k] + " ");
		}
		System.out.println("");
	}
	
	private static int[] reverse(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;

		while(start < end){
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}

}
