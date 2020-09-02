package com.newgen.ds.array;

import java.util.HashMap;

//Element is majority element if number of occurrences > n/2
public class MajorityElement {

	public static void main(String[] args) {
		
		int arr[] = {1,1,3,1,3,4,2,1,1,2,1};
		int n = arr.length/2;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0 ; i<arr.length; i++){
			
			if(hm.containsKey(arr[i])){
				
				hm.put(arr[i], hm.get(arr[i]) + 1);
				if(hm.get(arr[i]) > n){
					System.out.println("Majority Found : " + arr[i]);
				}
						
			}else{
				hm.put(arr[i], 1);
			}			
		}
	}

}
