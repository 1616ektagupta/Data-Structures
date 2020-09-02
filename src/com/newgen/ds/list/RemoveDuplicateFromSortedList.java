package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class RemoveDuplicateFromSortedList {

		static Node head = null;

		public static void main(String[] args) {
			
			head = new Node(1);
			head.next = new Node(2);
			head.next.next = new Node(3);
			head.next.next.next = new Node(3);
			head.next.next.next.next = new Node(5);
			head.next.next.next.next.next = new Node(5);
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
			
			Node dup_nxt = null;
			Node p = temp;
			
			while(p != null && p.next != null){
				
				if(p.data == p.next.data){
					
					dup_nxt = p.next.next;
					
					if(dup_nxt == null){
						p.next = null;
						break;
					}
					
					p.next = dup_nxt;
				}else{
						p = p.next;
				}
					
			}
		}

}
