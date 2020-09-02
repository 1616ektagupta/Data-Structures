package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class RotateAroundNode {

	private static Node head;
	private static Node newHead;

	public static void main(String[] args) {

		LinkedList ll1 = new LinkedList();
		
		ll1.addNodeAfter(1);
		ll1.addNodeAfter(2);
		ll1.addNodeAfter(3);
		ll1.addNodeAfter(4);
		ll1.addNodeAfter(5);
		ll1.addNodeAfter(6);
		ll1.addNodeAfter(7);
		
		head = ll1.head;
		
		rotate(4,head);
		print(newHead);
	}
	
	private static Node rotate(int i, Node temp) {
		
		Node p = temp;
		Node q = null;
		
		while(p != null){	//Traverse pointer p to the given data node
			
			if(p.data == i){
				newHead = p.next;
				q = newHead;
				p.next = null;
				break;
			}
			
			p = p.next;
		}
		
		//To handle last node
		if(q == null){
			newHead = head;
			return head;
		}
		
		//Traverse pointer q to the last node
		while(q.next != null){
			q = q.next;
		}
		
		q.next = head;
		
		return newHead;
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
