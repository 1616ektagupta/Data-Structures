package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class AddTwoNumbers {
	
	static Node head1 = null;
	static Node head2 = null;
	static Node head3 = null;
	static LinkedList ll1 = new LinkedList();
	static LinkedList ll2 = new LinkedList();
	static LinkedList ll3 = new LinkedList();

	public static void main(String[] args) {

		ll1.addNodeAfter(1);
		ll1.addNodeAfter(2);
		ll1.addNodeAfter(3);
		ll1.addNodeAfter(4);
		ll1.addNodeAfter(5);
		
		head1 = ll1.head;
		
		ll2.addNodeAfter(9);
		ll2.addNodeAfter(6);
		ll2.addNodeAfter(3);
		
		head2 = ll2.head;
		
		add(head1,head2);
	}

	private static void add(Node l1, Node l2) {
		
		Node list1 = l1;
		Node list2 = l2;
		int len1 = 0,len2=0,diff;
		
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
				ll2.addNodeBefore(0);
				diff--;
			}
		}else{
			diff = len2-len1; 
			while(diff > 0){
				ll1.addNodeBefore(0);
				diff--;
			}
		}
		
		//Reverse both list
		Node finalList1 = reverseList(ll1.head);
		Node finalList2 = reverseList(ll2.head);
		
		print(finalList1);
		print(finalList2);
		
		int carry = 0;
		
		while(finalList1 != null){
			
			int sum = finalList1.data + finalList2.data + carry;
			int remainder = sum%10;
			carry = sum/10;
			
			ll3.addNodeAfter(remainder);
			
			finalList1 = finalList1.next;
			finalList2 = finalList2.next;
		}
		
		if(carry > 0){
			ll3.addNodeAfter(carry);
		}
			
		head3  = reverseList(ll3.head);
		print(head3);
		
	}

	private static Node reverseList(Node l2) {
		
		if(l2 == null ||l2.next == null){
			return l2;
		}
		
		Node newHead = reverseList(l2.next);
		l2.next.next = l2;
		l2.next = null;
		
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

