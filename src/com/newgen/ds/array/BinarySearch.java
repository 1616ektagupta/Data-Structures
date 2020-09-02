package com.newgen.ds.array;

//Sorted Array o(nlogn)
public class BinarySearch {

	public static void main(String[] args) {

		int a[] = {1,5,8,14,20,26};
		int start = 0;
		int end = a.length-1;
		
		if(search(a,start,end,20)){
			System.out.println("Element found");
		}else{
			System.out.println("Element not found");
		}
	}

	public static boolean search(int[] a, int start, int end, int element) {
		
		if(start <= end){
			int mid = (start+end)/2;
			
			if(a[mid] == element){
				return true;
			}
			
			if(element < a[mid]){
				
				return search(a,start,mid-1,element);
				
			}else{
				
				return search(a,mid+1,end,element);
			}
		}else{
			return false;
		}
				
	}

}
