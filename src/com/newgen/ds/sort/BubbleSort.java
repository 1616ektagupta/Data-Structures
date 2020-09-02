package com.newgen.ds.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int size = 6;
		int a[] = {2,6,1,4,5,6};
		
		for(int i=0; i<size; i++){
			
			int flag = 0;
			for(int j=0; j<size-i-1; j++){
				
				if(a[j] > a[j+1]){
				 	
				 	int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
				
			}
			
			if(flag == 0){
				break;
			}
		}

		System.out.println("Sorted array is :" );
		for(int i=0; i<size; i++){
			System.out.print(a[i] + " ");
		}
	}
}
