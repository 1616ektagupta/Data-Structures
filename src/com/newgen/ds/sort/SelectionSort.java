package com.newgen.ds.sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int size = 6;
		int a[] = {2,6,3,1,5,4};
		
		for(int i=0; i<size-1;i++){
			
			int iMin = i;
			for(int j=i+1; j<size; j++){
				
				if( a[j] < a[iMin]){
					iMin = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[iMin];
			a[iMin] = temp;
			
		}
		
		System.out.println("Sorted array is :" );
		for(int i=0; i<size; i++){
			System.out.print(a[i] + " ");
			
		}
	}

}
