package com.newgen.ds.list;

public class ImpStackUsingArray {
	
	int maxSize = 10;
	int top = -1;
	int a[] = new int[maxSize];
	
	public void push(int value){
	
		if(top >= maxSize-1){
			System.out.println("Stack Overflow");
			return;
		}
		
		top++;
		a[top] = value;
		
	}
	
	public void pop(){
		
		if(top == -1){
			System.out.println("Stack Underflow");
			return;
		}
		
		top--;
	}
	
	public int top(){
		
			return a[top];
	}
	
	public boolean isEmpty(){
		
		if(top == -1){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void print(){
		
		for(int i=0 ; i<=top ; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
	}

}
