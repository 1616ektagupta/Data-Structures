package com.newgen.ds.array;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int a[] = {1,5,8,14,20,26};
		int b[] = {1,3,10,15,25};
		
		int ca = a.length;
		int cb = b.length;
		
		int c[] = new int[ca+cb];
		
		int i=0,j=0,k=0;
		
		while(i<ca && j<cb){
			
			if(a[i] <= b[j]){
				c[k] = a[i];
				i++;
			}else{
				c[k] = b[j];
				j++;
			}
			k++;
		}
		
		while(i<ca){
			c[k] = a[i];
			i++; k++;
		}
		
		while(j<cb){
			c[k] = b[j];
			j++; k++;
		}
		
		System.out.print("Merged sorted array is :" );
		for(int x=0; x<k; x++){
			System.out.print(c[x] + " ");
		}
		System.out.println("");
	}

}
