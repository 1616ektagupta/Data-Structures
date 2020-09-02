package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class MergeTwoSortedList {
	
	static Node head1 = null;
	static Node head2 = null;
	static Node head3 = null;

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.addNodeAfter(1);
		ll.addNodeAfter(3);
		ll.addNodeAfter(5);
		ll.addNodeAfter(7);
		ll.addNodeAfter(9);
		
		head1 = ll.head;
		
		LinkedList l2 = new LinkedList();
		l2.addNodeAfter(2);
		l2.addNodeAfter(4);
		l2.addNodeAfter(6);
		l2.addNodeAfter(8);
		l2.addNodeAfter(10);
		
		head2 = l2.head;
		
		merge(head1,head2);
		
		//Print linked list
		Node temp = head3;	
		
		while(temp.next != null){
			
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

	private static void merge(Node List1, Node List2) {

			if(List1.data <= List2.data){
		
				head3 = List1;
				List1 = List1.next;
			}else{
				head3 = List2;
				List2 = List2.next;
			}
			
			Node temp = head3;
			
			while(List1 != null  && List2 != null){
				
				if(List1.data <= List2.data){
					temp.next = List1;
					List1 = List1.next;
				}else{
					temp.next = List2;
					List2 = List2.next;
				}
				
				temp = temp.next;
			}
			
			if(List1 == null)
				temp.next = List2;
			
			if(List2 == null)
				temp.next = List1;
		
	}
}
