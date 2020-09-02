package com.newgen.ds.array;

public class FindNoOfRotation {

	public static void main(String[] args) {

		int a[] = {14,16,19,25,30,2,3,4,6,10,12};
		int n = a.length;
		
		System.out.println("No of rotations : " + rotations(a,0,a.length-1,n));
		
	}

	private static int rotations(int[] a, int start, int end, int n) {
		
		while(start <= end){
			
			if(a[start] <= a[end])
				return start;
			
			int mid = (start+end)/2;
			int mid_left = (mid-1+n)%n;
			int mid_right = (mid+1)%n;
			
			if(a[mid] < a[mid_left] && a[mid] < a[mid_right]){
				return mid;
			}
			else if(a[mid] <= a[end]){
				end = mid-1;
			}else if(a[mid] >= a[start]){
				start = mid+1;
			}
			
		}
		return -1;
		
	}

}
