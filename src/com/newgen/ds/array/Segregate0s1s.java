package com.newgen.ds.array;

public class Segregate0s1s {

	public static void main(String[] args) {

		int a[] = {1,0,1,1,0,0,0,1,1};
		int countOf0 = 0;
		
		for(int i=0; i<a.length; i++){
			
			if(a[i] == 0)
				countOf0++;
		}
		
		for(int i=0; i<a.length; i++){
			
			if(i < countOf0)
				a[i] = 0;
			else
				a[i] = 1;
		}	
		
		System.out.print("Segregated array is :" );
		for(int k=0; k<a.length; k++){
			System.out.print(a[k] + " ");
		}
		System.out.println("");
	}

}
