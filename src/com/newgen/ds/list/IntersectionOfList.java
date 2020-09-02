package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class IntersectionOfList {
	
	static Node head1 = null;
	static Node head2 = null;

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
		l2.addNodeAfter(7);
		l2.addNodeAfter(9);
		
		head2 = l2.head;
		
		intersection(head1,head2);

	}
	
	private static void intersection(Node l1, Node l2) {
		
		Node list1 = l1, p = l1;
		Node list2 = l2, q = l2;
		int len1 = 0, len2=0, diff;
		
		while(list1 != null){
			len1++;
			list1 = list1.next;
		}
		
		while(list2 != null){
			len2++;
			list2 = list2.next;
		}
		
		if(len1 > len2){
			diff = len1-len2; 
			while(diff > 0){
				p = p.next;
				diff--;
			}
		}else{
			diff = len2-len1; 
			while(diff > 0){
				q = q.next;
				diff--;
			}
		}
		
		while(p != null && q != null){
			
			if(p.data == q.data){ //Compare address to check if both lists points to the same node or not
				System.out.println("Intersection Node is :" + p.data);
				break;
			}
			
			p = p.next;
			q = q.next;
		}
		
	}
}
