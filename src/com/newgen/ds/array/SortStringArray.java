package com.newgen.ds.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortStringArray {

	public static void main(String[] args) {
		
		String[] arr = {"x","abcd","t","cv","lmno","dc"};
		TreeMap<Integer,ArrayList<String>> map = new TreeMap<Integer,ArrayList<String>>();
		
		for(int i=0; i<arr.length ; i++)
		{
			int l = arr[i].length();
			
			if(!map.containsKey(l)){
				ArrayList<String> a = new ArrayList<>();
				a.add(arr[i]);
				map.put(l, a);
			}else{
				ArrayList<String> a = map.get(l);
				a.add(arr[i]);
				map.put(l, a);
			}
			
		}
		         
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer,ArrayList<String>> e =  (Entry<Integer, ArrayList<String>>) it.next();
			ArrayList<String> l = e.getValue();
			Collections.sort(l);
			System.out.println(l);
			
		}

	}

}
