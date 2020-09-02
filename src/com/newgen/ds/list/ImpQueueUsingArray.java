package com.newgen.ds.list;

public class ImpQueueUsingArray {
	
	static int front = -1;
	static int rear = -1;
	static int maxSize = 10;
	static int a[] = new int[maxSize];

	public static void main(String[] args) {

		System.out.println("Queue is Empty? " + isEmpty());
		dequeue();
		enqueue(12);
		enqueue(15);
		enqueue(10); print();
		dequeue(); print();
		System.out.println("Queue is Empty? " + isEmpty());
		dequeue(); print();
		enqueue(20); print();
		dequeue(); print();
		System.out.println("Queue is Empty? " + isEmpty());
	}
	
	public static void enqueue(int data){
		
		if(isEmpty()){
			front = rear = 0;
			
		}else if(rear == maxSize-1){
			
			System.out.println("Stack Overflow");
			return;
			
		}else{
			rear = rear + 1;
		}
		
		a[rear] = data;
		
	}
	
	public static void dequeue(){
		
		if(front == rear){
			front = rear = -1;
		}else if(isEmpty()){
			
			System.out.println("Stack Underflow");
			return;
			
		}else{
			front = front + 1;
		}
		
	}
	
	public static int front(){
		
		return a[front];
		
	}
	
	public static boolean isEmpty(){
		
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	public static void print(){
		
		if(!isEmpty())
		{
			for(int i=front ; i<=rear ; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println("");
		}
		
	}
}
