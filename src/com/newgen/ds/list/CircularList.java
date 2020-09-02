package com.newgen.ds.list;

import java.util.Scanner;

public class CircularList {
	
	 static Node head;
		
	 static class Node {
		
		int data;
		Node next;
		
		Node(){
			
		}
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
	 }

	public static void main(String[] args) {
		
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter number of nodes :");
	 int n = s.nextInt();
	 Node temp = null;
	 
	 for(int i=0;i<n;i++){
		 
		 System.out.println("Enter "+(i+1)+" node data");
		 Node newNode = new Node(s.nextInt());
		 if(head == null){
			 head = newNode;
			 temp = head;
		 }
		 else{
			 temp.next = newNode;
			 temp = temp.next;
		 }
	 }
		
	 temp.next = head;
	 print(head);
	 
	}

	private static void print(Node head) {
		Node temp = head;	
						
		while(temp.next != head){
							
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
}
