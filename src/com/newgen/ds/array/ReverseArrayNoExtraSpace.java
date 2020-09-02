package com.newgen.ds.array;

public class ReverseArrayNoExtraSpace {

	public static void main(String[] args) {

		int a[] = {1,5,8,14,20,26};
		int b[] = {1,3,10,15,25};
		
		reverse(a);
		
	}

	public static void reverse(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;

		while(start < end){
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.print("Reversed array is :" );
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k] + " ");
		}
		System.out.println("");
	}

}
