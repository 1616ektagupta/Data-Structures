package com.newgen.ds.array;

public class MinimumJumps {

	public static void main(String[] args) {
		
		int a[] = {2,1,3,2,3,4,5,1,2,8};
		int jumpArray[] = new int[a.length];
		int pathArray[] = new int[a.length];
		
		for(int i=0; i<jumpArray.length; i++){
			jumpArray[i] = Integer.MAX_VALUE;
			pathArray[i] = Integer.MAX_VALUE;
		}
		
		jumpArray[0] = 0;
		pathArray[0] = 0;
		
		for(int i=1; i<a.length; i++){
			
			for(int j=0; j<i; j++){
				
				if(i <= j+a[j]){  //checking if i is in range of j
					
					jumpArray[i] = Math.min(jumpArray[i],jumpArray[j] + 1);
					if(pathArray[i] == Integer.MAX_VALUE)
						pathArray[i] = j;
					
				}
			}
		}
		
		System.out.print("jumpArray is :" );
		for(int k=0; k<jumpArray.length; k++){
			System.out.print(jumpArray[k] + " ");
		}
		System.out.println("");
		
		System.out.print("pathArray is :" );
		for(int k=0; k<pathArray.length; k++){
			System.out.print(pathArray[k] + " ");
		}
		System.out.println("");
	}

}
