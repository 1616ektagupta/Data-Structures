package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class SortList {
	
	static Node head = null;

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.addNodeAfter(13);
		ll.addNodeAfter(5);
		ll.addNodeAfter(19);
		ll.addNodeAfter(10);
		ll.addNodeAfter(1);
		ll.addNodeAfter(11);
		
		head = ll.head;
		
		//Print linked list
				Node temp = head;	
				
				while(temp.next != null){
					
					System.out.print(temp.data + " -> ");
					temp = temp.next;
				}
				System.out.println(temp.data);
		
				System.out.println(head.data);
				head = sort(head);
		
		//Print linked list
				Node sorted = head;	
				
				while(sorted.next != null){
					
					System.out.print(sorted.data + " -> ");
					sorted = sorted.next;
				}
				System.out.println(sorted.data);
		
	}
	
	public static Node sort(Node head){
		
		Node slow = head ,fast = head, temp = head;
		
		if(head == null || head.next == null){
			return head;
		}
		
		while(fast != null && fast.next != null){
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		temp.next = null;
		
		Node left_side = sort(head);
		Node right_side = sort(slow);
		
		return merge(left_side,right_side);
		
	}

	public static Node merge(Node p, Node q) {
		
		Node list = new LinkedList.Node(0);
		Node s = list;
		
		while(p != null && q != null){
			if(p.data <= q.data){
				s.next = p;
				p = p.next;
			}else{
				s.next = q;
				q = q.next;
			}
			
			s = s.next;
		}
		
		if(p == null){
			s.next = q;
		}
		
		if(q == null){
			s.next = p;
		}
		
		return list.next;
	}

}


