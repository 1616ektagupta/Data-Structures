package com.newgen.ds.array;

public class LeadersInArray {

	public static void main(String[] args) {
		
		int arr[] = {30,3,20,5,6,9,1,7,15,2};
		int MaxFromEnd = arr[arr.length-1];
		System.out.println("Leader is : " + MaxFromEnd);
		
		for(int i=arr.length-1; i>=0 ; i--){
			
			if(arr[i] > MaxFromEnd){
				MaxFromEnd = arr[i];
				System.out.println("Leader is : " + MaxFromEnd);
			}
		}

	}

}
