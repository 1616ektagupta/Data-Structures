package com.newgen.ds.array;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		
		int a[] = {9,10,12,14,20,26,2,4,5,7,8};  //SortedRotatedArray
		int start = 0;
		int end = a.length-1;
		
		int pivot = findPivot(a,start,end);
		System.out.println(a[pivot]);
		
		System.out.print("Array is :" );
		for(int x=0; x<a.length; x++){
			System.out.print(a[x] + " ");
		}
		System.out.println("");
		
		int element = 2;
		boolean found;
		if(element >= a[pivot] && element <= a[end]){
			found = BinarySearch.search(a,pivot,end,element);
		}else{
			found = BinarySearch.search(a,start,pivot-1,element);
		}

		if(found){
			System.out.println(element + " found");
		}else{
			System.out.println(element + " Not found");
		}
	}

	private static int findPivot(int[] a, int start, int end) {
		
			int mid = (start+end)/2;
			
			if(a[mid] > a[mid+1]){
				
				return mid+1;
			}

			if(a[start] > a[mid]){
				
				return findPivot(a,start,mid-1);
				
			}else{
				
				return findPivot(a,mid+1,end);
			}
	}

}
