package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class ReverseGroupOfSizeK {

	static Node head = null;
	static Node newHead = null;
	

	public static void main(String[] args) {
		
		LinkedList ll1 = new LinkedList();
		
		ll1.addNodeAfter(1);
		ll1.addNodeAfter(2);
		ll1.addNodeAfter(3);
		ll1.addNodeAfter(4);
		ll1.addNodeAfter(5);
		ll1.addNodeAfter(6);
		ll1.addNodeAfter(7);
		ll1.addNodeAfter(8);
		ll1.addNodeAfter(9);
		ll1.addNodeAfter(10);
		ll1.addNodeAfter(11);
		
		head = ll1.head;
		
		newHead = Process(3,head);
		print(newHead);
	}
	
	private static Node Process(int k, Node start) {
		
		Node p = start;
		Node temp, q = null;
		
		for(int i=1 ; i<k ; i++){
			
			if(p.next == null){
				return start;
			}
			
			p = p.next;
		}
		
		newHead = p;
		q = newHead;
		
		while(true){
			
			p = start;
			temp = q.next;
			
			if(temp == null){
				reverse(p);
				return newHead;
			}
			
			q.next = null;
			q = temp;
			start = temp;
			
			int count = 1;
			
			while(count != k){
				
				if(temp.next == null){
					reverse(p);
					p.next = q;
					return newHead;
				}
				temp = temp.next;
				count++;
			}
			
			reverse(p);
			p.next = temp;
			q = temp;
			
		}
		
	}
	
	private static Node reverse(Node l2) {
		
		if(l2 == null ||l2.next == null){
			return l2;
		}
		
		Node newList = reverse(l2.next);
		l2.next.next = l2;
		l2.next = null;
		
		return newList;
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
