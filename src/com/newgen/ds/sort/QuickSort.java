package com.newgen.ds.sort;

import java.util.Random;
import java.util.stream.IntStream;

public class QuickSort {

	public static void main(String[] args) {
		
		int a[] = {2,6,1,7,5,4,8,3};
		
		a = sort(a,0,7);
		
		System.out.println("Sorted array is :" );
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

	public static int[] sort(int[] a, int start, int end) {

		if(start < end){
			
			int pIndex = partition(a,start,end);
			System.out.println("pIndex :" + pIndex);
			sort(a,start,pIndex-1);
			sort(a,pIndex+1,end);
			
		}
		return a;
		
		
	}

	private static int partition(int[] a, int start, int end) {

		int pivot = a[end];
		int pIndex = start;
		
		for(int i=start; i<end; i++){
			
			if(a[i] <= pivot){
				
				int temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
				
			}
		}
		
		int temp = a[end];
		a[end] = a[pIndex];
		a[pIndex] = temp;
		
		return pIndex;
	}
	
	private static int Randomizedpartition(int[] a, int start, int end) {
		
		Random r = new Random();
		int pivotIndex = r.nextInt(end);
		System.out.println("pivotIndex :" + pivotIndex);
		
		int temp1 = a[pivotIndex];
		a[pivotIndex] = a[end];
		a[end] = temp1;
		
		int pivot = a[end];
		int pIndex = start;
		
		for(int i=start; i<end; i++){
			
			if(a[i] <= pivot){
				
				int temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
				
			}
		}
		
		int temp = a[end];
		a[end] = a[pIndex];
		a[pIndex] = temp;
		
		return pIndex;
		
	}

}
