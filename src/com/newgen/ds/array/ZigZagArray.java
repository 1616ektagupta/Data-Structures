package com.newgen.ds.array;

public class ZigZagArray {

	public static void main(String[] args) {

		int arr[] = {1,12,5,3,25,4,2,5,3,1};
		int flag = 0;
		
		for(int i=0 ; i<arr.length-1; i++){
			
			if(flag == 0){
				
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				flag = 1;
			}else{
				
				if(arr[i] < arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				flag = 0;
			}
			
		}
		
		System.out.print("Zig Zag array is :" );
		for(int x=0; x<arr.length; x++){
			System.out.print(arr[x] + " ");
		}
		System.out.println("");
		
	}

}
