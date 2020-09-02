package com.newgen.ds.sort;

public class InsertionSort {

	public static void main(String[] args) {
		
		int size = 6;
		int a[] = {2,6,1,3,5,4};
		
		for(int i=1; i<size; i++){
			
			int value = a[i];
			int hole = i;
			
			while(hole>0 && a[hole-1] > value){
				
				a[hole] = a[hole-1];
				hole = hole-1;
				
			}
			
			a[hole] = value;
		}

		System.out.println("Sorted array is :" );
		for(int i=0; i<size; i++){
			System.out.print(a[i] + " ");
		}
	}

}
