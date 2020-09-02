package com.newgen.ds.list;

public class LinkedList {
	
	 Node head;
	
	 static class Node {
		
		int data;
		Node next;
		
		Node(){
			
		}
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
		
		/*@Override
		public void finalize(){
			
			System.out.println("Destroying : "+this.data);
			
		}*/
	}
	
	public void addNodeBefore(int d){
		
		//Add new node
		Node newNode = new Node(d);
		
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
		
		//Print linked list
		Node temp = head;	
		
		while(temp.next != null){
			
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
		
	}
	
public void addNodeAfter(int d){
		
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
		
		
		//Print linked list
		Node temp = head;	
		
		while(temp.next != null){
			
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
		
	}

public void insertNodeAt(int d,int position){
	
	//Add new node
	Node newNode = new Node(d);
	
		if(position == 1){
			newNode.next = head;
			head = newNode;
		}else{
			Node prev = head;
			for(int i =0 ; i < position-2 ; i++){
				prev = prev.next;
				
			}
			newNode.next = prev.next;
			prev.next = newNode;
		}
		
	
		//Print linked list
				Node temp = head;	
				
				while(temp.next != null){
					
					System.out.print(temp.data + " -> ");
					temp = temp.next;
				}
				System.out.println(temp.data);
	
}

public void deleteNodeAt(int position){
	
		Node temp1 = head;
		
		if(head == null)
			return;
	
		if(position == 1){
			head = temp1.next;
			temp1 = null;
		}else{
			Node prev = head;
			for(int i =0 ; i < position-2 ; i++){
				prev = prev.next;
			}
			temp1 = prev.next;
			prev.next = prev.next.next;
			temp1 = null;
		}
		
	
		//Print linked list
		Node temp = head;	
				
		while(temp.next != null){
					
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	
}

public void findMiddleNode(int methodNumber){
	
	/*For Odd number of elements : count/2
	For even number of elements : (count/2) + 1*/
	
	int s = methodNumber;
	
		switch(s){
		
			case 1 : {
				
				//Method 1 : Using two pointers : fast and slow
				int midNode;
				Node fast_pointer = head;
				Node slow_pointer = head;
				
				while(fast_pointer != null && fast_pointer.next != null){
					
					fast_pointer = fast_pointer.next.next;
					slow_pointer = slow_pointer.next;
					
				}
				
				midNode = slow_pointer.data;
				System.out.println("Mid Node is : " + midNode);
				
				break;
			}
			case 2 : {
				
				//Method 2 : Using mid and counter, increase mid when counter is odd
				Node midNode = head;
				Node temp = head;
				int counter = 0;
				
				while(temp != null){
					
					if(!(counter%2 == 0)){
						midNode = midNode.next;
					}
					
					counter++;
					temp = temp.next;
				}
				
				
				System.out.println("Mid Node is : " + midNode.data);
						
				break;
			}
			default : 
				break;
		}
	
	}

public void reverse(){
	
	Node prev = null;
	Node next = null;
	Node curr = head;
	
	while(curr != null){
		
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		
	}
	
	//Print linked list
	Node temp = prev;	
	
	while(temp.next != null){
		
		System.out.print(temp.data + " -> ");
		temp = temp.next;
	}
	System.out.println(temp.data);
	
	}

public void swapTwoNodes(){
	
	Node first = head;
	Node second = first.next;
	Node temp = second.next;
	Node n = head.next;	
	
	while(temp != null){
		
		second.next = first;
		first.next = temp.next;
		first = temp;
		second = first.next;
		temp = second.next;
		
		}
	
		second.next = first;
		first.next = null;
		
		//Print linked list
		while(n.next != null){
					
			System.out.print(n.data + " -> ");
			n = n.next;
		}
			System.out.println(n.data);
		
	}

public void swapTwoNodesDJ(){
	
	Node first = head;
	Node second = null;
	Node temp = null;
	Node n = head.next;	
	
	while(true){
		second = first.next;
		temp = second.next;
		second.next = first;
		
		if(temp==null || temp.next ==null){
			first.next = temp;
			break;
		}
		
		first.next = temp.next;
		first = temp;
	}
		
		//Print linked list
		while(n.next != null){
					
			System.out.print(n.data + " -> ");
			n = n.next;
		}
			System.out.println(n.data);
		
	}
	
}
