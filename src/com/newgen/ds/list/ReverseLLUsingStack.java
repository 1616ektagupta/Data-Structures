package com.newgen.ds.list;

import java.util.Stack;

import com.newgen.ds.list.LinkedList.Node;

public class ReverseLLUsingStack {
	
		static Node Head;

	public static void main(String[] args) {
		
		LinkedList n = new LinkedList();
		
		n.addNodeAfter(2);
		n.addNodeAfter(4);
		n.addNodeAfter(6);
		n.addNodeAfter(8);
		n.addNodeAfter(10);
		Head = n.head;
		
		reverse(Head);
		
		System.out.println( "::Printing reverse linked list::");
		
		//Print linked list
		Node temp = Head;	
		
		while(temp.next != null){
			
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}
	
	public static void reverse(Node temp){
		
		Stack<Node> s = new Stack();
		
		while(temp != null){
			
			s.push(temp);
			temp = temp.next;
		}
		
		Head = s.pop();		//Making last node as head
		Node temp1 = Head;
		while(!s.isEmpty()){	//Inserting each node at tail of a linked list until stack is empty
			
			temp1.next = s.pop();
			temp1 = temp1.next;
			
		}
		
		temp1.next = null;	//Assigning null as a last node's address
		
	}

}
