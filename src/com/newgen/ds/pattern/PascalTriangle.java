package com.newgen.ds.pattern;

public class PascalTriangle {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=0; i<n; i++){
			
			for(int j=n-i; j>1; j--){
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++){
				if(j==0 || j==i){
					System.out.print("* ");
				}else
				System.out.print("* ");
			}
			
			System.out.println("");
		}

	}

}
