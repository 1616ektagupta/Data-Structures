package com.newgen.ds.array;

import java.util.Stack;

public class NextGreaterElementFromStack {

	public static void main(String[] args) {


		int arr[] = {10,3,3,12,5,4,6,9,1,7,15,12,10};
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(arr[0]);
		
		for(int i=1; i<arr.length ; i++){
			
			if(arr[i] <= s.peek()){
				s.push(arr[i]);
			}else{
				
				while(arr[i] > s.peek()){
					int m = s.pop();
					System.out.println("Next Greater of " +m+ " is " + arr[i]);
					if(s.isEmpty()){
						break;
					}
				}
				s.push(arr[i]);
			}
			
		}

		while(!s.isEmpty()){
			System.out.println("No next greater of " + s.pop());
		}
	}

}
