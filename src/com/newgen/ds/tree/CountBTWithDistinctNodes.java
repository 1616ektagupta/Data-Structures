package com.newgen.ds.tree;

//if n=4 then {1,2,3,4} all nodes should be distinct
public class CountBTWithDistinctNodes {

	public static void main(String[] args) {

		int n = 6;
		countBST(n+1);
		
	}

	private static void countBST(int n) {
		
		int a[] = new int[n];
		a[0] = a[1] = 1;
		
		for(int i=2 ;i<n ; i++){
			
			a[i] = 0;
			
			for(int j=0; j<i ; j++){
				
				a[i] += a[j] * a[i-j-1];
				
			}
			
		}
		
		for(int j=0; j<n; j++){
			
			System.out.println(a[j]);
			
		}
	}

}
