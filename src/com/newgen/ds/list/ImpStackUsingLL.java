package com.newgen.ds.list;


public class ImpStackUsingLL {
	
	 Node head;
		
	 class Node {
		
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
	}
	 
	 public void push(int data){
		 
		 Node newNode = new Node(data);
		 
		 if(head == null){
			 head = newNode;
		 }else{
			 
			 newNode.next = head;
			 head = newNode;
		 }
	 }
		
	public void pop(){
			
		 if(head == null){
			 System.out.println("Stack underflow");
			 return;
		 }else{
			 Node temp = head;
			 head = head.next;
			 temp= null;
		 }
	}
	
	public void print(){
		
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
		
	}
	
	public Node top(){
		
		 if(head == null){
			 System.out.println("Stack underflow");
			 return null;
		 }else{
			 Node temp = head;
			 return temp;
		 }
	}
	
	public boolean isEmpty(){
		
		if(head == null){
			return true;
		}else{
			return false;
		}
		
	}

}
