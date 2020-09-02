package com.newgen.ds.list;

import com.newgen.ds.list.LinkedList.Node;

//Using floyd's algorithm
public class DetectAndRemoveLoop {
	
	static Node head = null;

	public static void main(String[] args) {
		
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = head.next.next;
		
		if(!findLoop(head)){
			System.out.println("Loop not found");
		}
		
		//Print linked list
		Node temp = head;	
				
		while(temp.next != null){
					
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

	private static boolean findLoop(Node temp) {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				System.out.println("Loop found");
				remove(fast,head);
				return true;
			}
		}
		
		return false;
		
	}

	private static void remove(Node fast, Node temp) {

		while(fast.next != temp.next){
			fast = fast.next;
			temp = temp.next;
		}
		
		System.out.println("Start node of loop is : " + fast.next.data);
		fast.next = null;
	}

}
