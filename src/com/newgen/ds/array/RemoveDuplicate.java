package com.newgen.ds.array;

//Remove duplicate from sorted array
public class RemoveDuplicate {

	public static void main(String[] args) {

		int a[] = {1,2,2,3,3,3,4,5,5,6,6};
		int b[] = new int[a.length];
		
		int i=0,j=0;
		
		for(i=0;i<a.length-1;i++){
			
			if(a[i] != a[i+1]){
				b[j] = a[i];
				j++;
			}
			
		}
		
		b[j] = a[i];

		System.out.print("Extra memory array is :" );
		for(int k=0; k<=j; k++){
			System.out.print(b[k] + " ");
		}
		System.out.println("");
		
		inPlace(a);
	}

	public static void inPlace(int[] array) {
		
		int a[] = {1,2,2,3,3,3,4,5,5,6,6};
		
		int i=0,j=0;
		
		for(i=0;i<a.length-1;i++){
			
			if(a[i] != a[i+1]){
				a[j] = a[i];
				j++;
			}
			
		}
		
		a[j] = a[i];

		System.out.print("inPlace method array is :" );
		for(int k=0; k<=j; k++){
			System.out.print(a[k] + " ");
		}
		System.out.println("");
	}
}
