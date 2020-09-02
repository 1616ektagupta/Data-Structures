package com.newgen.ds.list;

import com.newgen.ds.list.Node;

public class ReverseDoublyLL {
	
	static Node head;

	public static void main(String[] args) {
		
		DoublyLinkedList.addNodeAfter(1);
		DoublyLinkedList.addNodeAfter(2);
		DoublyLinkedList.addNodeAfter(3);
		DoublyLinkedList.addNodeAfter(4);
		DoublyLinkedList.addNodeAfter(5);
		
		head = DoublyLinkedList.head;
		
		print(head);	
		reverse(head);
		print(head);				
	}

	private static void reverse(Node head) {
		
		Node temp = null;
		Node curr = head;
		
		if(head == null || head.next == null){
			return;
		}
		
		while(curr != null){
			
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
			
		}
		
		temp = temp.prev;
		ReverseDoublyLL.head = temp;
	}

	private static void print(Node head) {
		Node temp = head;	
						
		while(temp.next != null){
							
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
