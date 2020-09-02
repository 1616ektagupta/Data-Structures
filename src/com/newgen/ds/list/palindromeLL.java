package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

public class palindromeLL {
	
	static Node head = null;

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.addNodeAfter(1);
		ll.addNodeAfter(2);
		ll.addNodeAfter(3);
		ll.addNodeAfter(4);
		ll.addNodeAfter(4);
		ll.addNodeAfter(3);
		ll.addNodeAfter(2);
		ll.addNodeAfter(1);
		
		head = ll.head;
		
		if(isPalindrom(head)){
			System.out.println("List is palindrome");
		}else
			System.out.println("List is not palindrome");
		
	}

	private static boolean isPalindrom(Node temp) {
		
		Node slow=temp, fast = temp;
		Node second_start = null;
		
		while(true){
			fast = fast.next.next;
			
			if(fast == null){
				second_start = slow.next;
				break;
			}
			
			if(fast.next == null){
				second_start = slow.next.next;
				break;
			}
			
			slow = slow.next;
		}
		
		slow.next = null;
		
		print(head);
		print(second_start);
		
		return compare(head, second_start);
	}

	private static boolean compare(Node l1, Node l2) {

		//Reverse 2nd list
		Node head1 = l1;
		Node head2 = reverseList(l2);
		
		print(head1);
		print(head2);
		
		//now compare both list
		while(head1 != null){
			
			if(head1.data != head2.data){
				return false;
			}
			
			head1 = head1.next;
			head2 = head2.next;
		}
		
		return true;
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
