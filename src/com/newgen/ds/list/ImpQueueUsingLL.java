package com.newgen.ds.list;

public class ImpQueueUsingLL {

	Node head = null;
	Node tail = null;
	
	 class Node {
		
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next = null;			
		}
	}
	 
	 public void enqueue(int data){
		 
		 Node newNode = new Node(data);
		 
		 if(isEmpty()){
			 head = newNode;
			 tail = newNode;
		 }else{
			 
			 tail.next = newNode;
			 tail = newNode;
		 }
	 }
		
	public void dequeue(){
			
		 if(isEmpty()){
			 System.out.println("Stack underflow");
			 return;
		 }else if(head == tail){
			 head = tail = null;
		 } else{
			 Node temp = head;
			 head = head.next;
			 temp= null;
		 }
	}
	
	public Node front(){

		return head;
		
	}
	
	public boolean isEmpty(){
		
		if(head == null && tail == null){
			return true;
		}else{
			return false;
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
	

}
