package com.newgen.ds.sort;

public class MergeSort {

	public static void main(String[] args) {
		
		int a[] = {2,6,1,7,5,4,8,3};
		
		sort(a);
		
		System.out.println("Sorted array is :" );
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
	}
	
	private static void sort(int[] a) {
		
		System.out.print("Unsorted array is :" );
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");

		int n = a.length;
		
		if(n < 2){
			return;
		}
		
		int mid = n/2;
		
		int left[] = new int[mid];
		int right[] = new int[n-mid];
		
		for(int i=0 ; i<mid ;i++){
			left[i] = a[i];
		}
		
		for(int i=mid ; i<n ;i++){
			right[i-mid] = a[i];
		}
		
		sort(left);
		sort(right);
		
		System.out.print("left array is :" );
		for(int x=0; x<left.length; x++){
			System.out.print(left[x] + " ");
		}
		System.out.println("");
		System.out.print("right array is :" );
		for(int x=0; x<right.length; x++){
			System.out.print(right[x] + " ");
		}
		System.out.println("");
		merge(left,right,a);
		
	}

	private static void merge(int[] left, int[] right, int[] a) {
		
		System.out.print("before array is :" );
		for(int x=0; x<a.length; x++){
			System.out.print(a[x] + " ");
		}
		System.out.println("");
		
		int nl =left.length;
		int nr = right.length;
		int i=0,j=0,k=0;
		
		while(i<nl && j<nr){
			
			if(left[i] <= right[j]){
				a[k] = left[i]; 
				i++;
			}else{
				a[k] = right[j]; 
				j++;
			}
			k++;
		}
		
		while(i<nl){
			a[k] = left[i]; 
			k++;
			i++;
		}
		while(j<nr){
			a[k] = right[j]; 
			k++;
			j++;
		}
		
		System.out.print("After array is :" );
		for(int x=0; x<a.length; x++){
			System.out.print(a[x] + " ");
		}
		System.out.println("");
	}

}
