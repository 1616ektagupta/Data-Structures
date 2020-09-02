package com.newgen.ds.array;


public class FirstOrLastOccurrence {

	public static void main(String[] args) {

		int a[] = {2,4,5,7,10,10,10,10,12,12,15};
		int element = 10;
		
		System.out.println("First occurrence of "+element + " is " + occurrence(a,0,a.length-1,element,true));
		
		System.out.println("Last occurrence of "+element + " is " + occurrence(a,0,a.length-1,element,false));
		
	}

	private static int occurrence(int[] a, int start, int end, int x, boolean flag) {

		int result = -1;
		
		while(start <= end){
			
			int mid = (start+end)/2;
			
			if(a[mid] == x){
				
				result = mid;
				
				if(flag)
					end = mid-1;
				else
					start = mid+1;
						
			}
			else if(x < a[mid])
				end = mid-1;
			else
				start = mid+1;
		}
		
		return result;
		
	}

}
