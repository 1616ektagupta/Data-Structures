package com.newgen.ds.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class OddOccurrence {

	public static void main(String[] args) {

		int arr[] = {1,3,1,3,4,2,4,1,2,5};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0 ; i<arr.length; i++){
			
			if(hm.containsKey(arr[i])){
				
				hm.put(arr[i], hm.get(arr[i]) + 1);
				
			}else{
				hm.put(arr[i], 1);
			}			
		}
		
		Iterator i = hm.entrySet().iterator();
		while(i.hasNext()){
			
			Entry<Integer, Integer> temp =  (Entry<Integer, Integer>) i.next();
			if(temp.getValue()%2 != 0){
				System.out.println(temp.getKey() + " is having odd occurrence");
			}
		}
	}

}
