package com.newgen.ds.list;

public class ListByRecursion {
	
	Node head;
	
	public class Node{
		
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void addNodeAfter(int d,boolean flag){
		
		//Add new node
		Node newNode = new Node(d);
		
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
		if(flag){
			
			//Print linked list
			Node temp1 = head;
			System.out.println("Reverse list using recursion");
			reverse(temp1);
			System.out.println("");
			
			//Print linked list
			Node temp = head;	
			
			while(temp.next != null){
				
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
			
		}
		
	}
	
	public void printListFwd(Node head){
		
		if(head == null)
			return;
		else{
			System.out.print(head.data + " ");
			printListFwd(head.next);
		}
	}

	public void printListBwd(Node head){
		if(head == null)
			return;
		else{
			printListBwd(head.next);
			System.out.println(head.data + " ");
		}
	}
	
	public void reverseList(Node temp){
		if(temp.next == null){
			head = temp;
			return;
		}
		else{
			reverseList(temp.next);
			Node prev = temp.next;
			prev.next = temp;
			temp.next = null;
		}
	}
	
	public Node reverse(Node temp){
		
		if(temp == null || temp.next == null){
			return temp;
		}
		
			head = reverse(temp.next); //last node will set new head
			temp.next.next = temp;
			temp.next = null;
			return head;
	}
	
}
