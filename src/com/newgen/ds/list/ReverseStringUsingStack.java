package com.newgen.ds.list;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static void main(String[] args){
		
		String input = "Hello";
		char[] output = reverse(input);
		
		System.out.println("Output String : " );
		for(int i=0; i<output.length; i++){
			System.out.print(output[i]);
		}	
		
	}
	
	public static char[] reverse(String input){
		
		int count = input.length();
		char[] output = new char[count];
		Stack<Character> s = new Stack();
		
		for(int i=0; i<count; i++){
			
			s.push(input.charAt(i));
		}		
		
		for(int i=0; i<count; i++){
			
			output[i] = s.pop();
		}
		
		return output;
		
	}

}
