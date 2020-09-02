package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class SwapTwoNodes {
	
	static Node head = null;

	public static void main(String[] args) {
		
		LinkedList ll1 = new LinkedList();
		
		ll1.addNodeAfter(1);
		ll1.addNodeAfter(2);
		ll1.addNodeAfter(3);
		ll1.addNodeAfter(4);
		ll1.addNodeAfter(5);
		
		head = ll1.head;
		
		print(head);
		swap(2,4,head);
		print(head);

	}

	private static void swap(int d1, int d2, Node temp) {
		
		//First Search
		Node p =temp,q = temp;
		Node prevP=null,prevQ = null;
		
		while(p.data != d1){
			prevP = p;
			p = p.next;
		}
		
		while(q.data != d2){
			prevQ = q;
			q = q.next;
		}
		
		Node nxt = q.next;
		q.next = p.next;
		p.next = nxt;
		
		if(p == temp){
			head = q;
			prevQ.next = p;
		}
		else if(q == temp){
			head = p;
			prevP.next = q;
		}
		
		else if(p!= temp && q != temp){
			prevP.next = q;
			prevQ.next = p;
		}
		
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
