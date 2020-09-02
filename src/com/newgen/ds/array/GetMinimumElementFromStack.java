package com.newgen.ds.array;

import java.util.Stack;

public class GetMinimumElementFromStack {

	public static void main(String[] args) {

		int arr[] = {10,3,12,5,6,9,1,7,15,2};
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> minStack = new Stack<Integer>();
		
		for(int i=0; i<arr.length ; i++){
			
			s.push(arr[i]);
			
			if(minStack.empty()){
				minStack.push(arr[i]);
			}
			
			else if(s.peek() < minStack.peek()){
				minStack.push(arr[i]);
			}
			
			getMin(minStack);
		}
		
		System.out.println("Now pop :");
		for(int i=0; i<4 ; i++){
			
			if(s.peek() == minStack.peek()){
				minStack.pop();
			}
			s.pop();
			getMin(minStack);
		}
		
	}
	
	private static void getMin(Stack<Integer> minStack){
		
		System.out.println(minStack.peek());
		
	}

}
