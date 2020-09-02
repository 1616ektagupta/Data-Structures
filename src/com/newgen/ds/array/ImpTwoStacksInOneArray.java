package com.newgen.ds.array;

import java.util.Stack;

public class ImpTwoStacksInOneArray {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		s1.push(6);
		s1.push(4);
		s1.push(2);
		
		s2.push(12);
		s2.push(10);
		s2.push(8);
		s2.push(15);
		
		int n = s1.size() + s2.size();
		int arr[] = new int[n];

		int top1 = 0;
		int top2 = arr.length-1;
		
		while(!s2.isEmpty()){
			
			if(top1 == top2+1){
				System.out.println("array is full");
				break;
			}
			
			else{
				arr[top2--] = s2.pop();
			}
		}
		
		while(!s1.isEmpty()){
			
			if(top1 == top2+1){
				System.out.println("s1 array is full");
				break;
			}
			
			else{
				arr[top1++] = s1.pop();
			}
				
		}
		
		System.out.println("Merged array is :" );
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
	}

}
