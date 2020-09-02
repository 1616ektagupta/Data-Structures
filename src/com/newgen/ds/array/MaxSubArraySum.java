package com.newgen.ds.array;

//Kadane's algorithm
public class MaxSubArraySum {

	public static void main(String[] args) {
		
		int a[] = {-2,-3,4,-1,-2,1,5,-3};

		int global_max = 0;
		int local_max = 0;
		int start=0,end=0,temp = 0;
		
		for(int i=0; i<a.length; i++){
			
			local_max = local_max + a[i];
			
			if(local_max < 0){
				local_max = 0;
				temp = i+1;
			}else if(local_max > global_max){
				global_max = local_max;
				start = temp;
				end = i;
			}
		}
		
		System.out.println("MaxSubArraySum is : " + global_max);
		System.out.println("Start Index : " + start);
		System.out.println("End Index : " + end);
		
	}
	
	static int maxSubArraySum(int a[], int size) 
    { 
		
	    int max_so_far = a[0]; 
	    int curr_max = a[0]; 
	  
	    for (int i = 1; i < size; i++) 
	    { 
	        curr_max = Math.max(a[i], curr_max+a[i]); 
	        max_so_far = Math.max(max_so_far, curr_max); 
	    } 
	    
	    return max_so_far; 
    }

}





