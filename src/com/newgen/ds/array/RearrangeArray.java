package com.newgen.ds.array;

public class RearrangeArray {

	public static void main(String[] args) {

		int a[] = {3,2,5,6,0,4,1};
		int b[] = new int[a.length];
		
		for(int i=0 ; i<a.length; i++){
			
			b[a[i]] = i;
		}
		
		System.out.print("Rearranged array is :" );
		for(int k=0; k<b.length; k++){
			System.out.print(b[k] + " ");
		}
		System.out.println("");
	}

}
