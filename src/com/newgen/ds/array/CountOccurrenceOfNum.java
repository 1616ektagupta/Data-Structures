package com.newgen.ds.array;

//Count occurrence of any number in sorted array with duplicate elements. 
public class CountOccurrenceOfNum {

	public static void main(String[] args) {

		int a[] = {2,4,5,7,10,10,10,10,12,12,15};
		int element = 12;
		
		int First_0ccurrence = occurrence(a,0,a.length-1,element,true);
		
		if(First_0ccurrence == -1){
			System.out.println(element + " is occurring " + 0 + " times");
		}else{
			int Last_occurrence = occurrence(a,0,a.length-1,element,false);
			int count = Last_occurrence - First_0ccurrence + 1;
			System.out.println(element + " is occurring " + count + " times");
		}
		
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
