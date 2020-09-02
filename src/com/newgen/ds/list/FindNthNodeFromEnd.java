package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class FindNthNodeFromEnd {

	private static Node head;

	public static void main(String[] args) {

		LinkedList ll1 = new LinkedList();
		
		ll1.addNodeAfter(1);
		ll1.addNodeAfter(2);
		ll1.addNodeAfter(3);
		ll1.addNodeAfter(4);
		ll1.addNodeAfter(5);
		
		head = ll1.head;
		
		find(2,head);
	}

	private static void find(int n, Node temp) {
		
		Node p = head, q=head;
		
		for(int i=0;i<n-1;i++){
			q = q.next;
		}
		
		while(q.next != null){
			p = p.next;
			q = q.next;
		}
		
		System.out.println(n + " node from end is : " +p.data);
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
