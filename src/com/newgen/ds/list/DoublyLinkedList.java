package com.newgen.ds.list;

class Node{
	
	int data;
	Node prev, next;
	
	public Node(int data){
		
		this.data = data;
		prev = null;
		next = null;
		
	}
	
}

public class DoublyLinkedList {
	
	static Node head = null;

	public static void main(String[] args) {
		
		addNodeAt(12,1);
		
		addNodeAfter(4);
		addNodeAfter(2);
		addNodeAfter(9);
		addNodeAfter(15);
		
		addNodeAt(10,4);
		addNodeAt(1,1);
		
		deleteNodeBefore();
		deleteNodeAfter();
		deleteNodeAt(3);
		
		//Print linked list
		Node temp = head;	
				
		while(temp.next != null){
					
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
			System.out.println(temp.data);

	}
	
	public static void addNodeBefore(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
		}else{
			
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
		}
	}
	
	public static void addNodeAfter(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
		}else{
			
			Node temp = head;
			
			while(temp.next != null)
			temp= temp.next;
			
			temp.next = newNode;
			newNode.prev = temp;
			
		}
	}

	public static void addNodeAt(int data, int position){
		
		Node newNode = new Node(data);
		
		if(head == null){
			System.out.println("List is empty");
		}else if(position == 1){
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}else{
			
			Node temp = head;
			
			for(int i =0 ; i < position-2 ; i++){
				temp= temp.next;				
			}
			
			Node nxt = temp.next;
			
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = nxt;
			nxt.prev = newNode;
			
		}
	}
	
public static void deleteNodeBefore(){
		
		if(head == null){
			System.out.println("List is empty");
		}else{
			
			Node temp = head;
			head = head.next;
			temp = null;
			
		}
	}
	
	public static void deleteNodeAfter(){
		
		if(head == null){
			System.out.println("List is empty");
		}else{
			
			Node temp = head;
			
			while(temp.next.next != null)
			temp= temp.next;
			
			Node toBeDeleteNode = temp.next;
			temp.next = null;
			toBeDeleteNode = null;
			
		}
	}

	public static void deleteNodeAt(int position){
		
		if(head == null){
			System.out.println("List is empty");
		}else if(position == 1){
			Node temp = head;
			head = head.next;
			temp = null;
		}else{
			
			Node prv = head;
			
			for(int i =0 ; i < position-2 ; i++){
				prv= prv.next;				
			}
			
			Node toBeDeleted = prv.next;
			Node nxt = toBeDeleted.next;
			
			prv.next = nxt;
			nxt.prev = prv;
			
			toBeDeleted = null;
			
		}
	}
	
}




