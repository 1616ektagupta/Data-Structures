package com.newgen.ds.array;

import com.newgen.ds.sort.QuickSort;

public class PairsWithGivenSum {

	public static void main(String[] args) {
		
		int a[] = {10,3,5,1,6,7,5,8,2,9,1,4,7,11};
		int sum = 11;
		int left = 0, right = a.length-1;

		int sortedArray[] = QuickSort.sort(a,left,right);
		
		System.out.println("Sorted array is :" );
		for(int i=0; i<sortedArray.length; i++){
			System.out.print(sortedArray[i] + " ");
		}
		System.out.println("");
		
		while(left<right){
			
			if(sortedArray[left] + sortedArray[right] < sum){
				left++;
			}else if(sortedArray[left] + sortedArray[right] > sum){
				right--;
			}else{
				System.out.println("Pair is : (" + sortedArray[left] + "," + sortedArray[right] + ")");
				left++;
				//right--;
			}
		}
	}

}
