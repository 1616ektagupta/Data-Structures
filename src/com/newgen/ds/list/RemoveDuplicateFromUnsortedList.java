package com.newgen.ds.list;

import java.util.HashSet;

import com.newgen.ds.list.LinkedList.Node;

public class RemoveDuplicateFromUnsortedList {
	
	static Node head = null;

	public static void main(String[] args) {
		
		head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next = new Node(5);
		
		removeDuplicate(head);
		
		//Print linked list
		Node temp = head;	
						
		while(temp.next != null){
							
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

	private static void removeDuplicate(Node temp) {
		
		HashSet<Integer> hs = new HashSet<>();
		Node current = temp;
		Node prev = null;
		
		while(current != null){
			
			Node duplicate = null;
			
			if(hs.contains(current.data)){
				
				duplicate = current;
				prev.next = current.next;
				
			}else{
				hs.add(current.data);
				prev = current;
			}
			
			current = current.next;
			duplicate = null;
			System.gc();
			
		}

	}

}
