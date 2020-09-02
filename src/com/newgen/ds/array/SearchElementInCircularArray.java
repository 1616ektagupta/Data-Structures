package com.newgen.ds.array;

public class SearchElementInCircularArray {

	public static void main(String[] args) {
		
		int a[] = {14,16,19,25,30,2,3,4,6,10,12};
		int element = 14;
		
		System.out.println("Found at " + find(a,0,a.length-1,element));

	}

	private static int find(int[] a, int start, int end, int element) {
		
		while(start <= end){
			
			int mid = (start+end)/2;
			
			if(a[mid] == element){
				return mid;
			}
			else if(a[mid] <= a[end]){
				
				if(element > a[mid] && element <= a[end])
					start = mid+1;
				else
					end = mid-1;
				
			}else if(a[start] <= a[mid]){
				
				if(element >= a[start] && element < a[mid])
					end = mid-1;
				else
					start = mid+1;
			}
			
		}
		return -1;
	}

}
