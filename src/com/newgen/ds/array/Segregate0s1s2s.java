package com.newgen.ds.array;

public class Segregate0s1s2s {

	public static void main(String[] args) {

		int a[] = {1,2,0,1,1,2,2,0,0,0,2,2,1};
		
		int low = 0, mid = 0, high = a.length-1;
		
		while(mid <= high){
			
			switch(a[mid]){
			
				case 0 : {
					int temp = a[low];
					a[low] = a[mid];
					a[mid] = temp;
					low++;mid++;
					break;
				}
				case 1 : {
					mid++;
					break;
				}
				case 2 : {
					int temp = a[mid];
					a[mid] = a[high];
					a[high] = temp;
					high--;
					break;
				}
			
			}
			
		}
		
		System.out.print("Segregated array is :" );
		for(int k=0; k<a.length; k++){
			System.out.print(a[k] + " ");
		}
		System.out.println("");
	}

}
