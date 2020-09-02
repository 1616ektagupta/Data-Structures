package com.newgen.ds.list;

public class Main {

	public static void main(String[] args) {

		
		LinkedList obj = new LinkedList();
		ListByRecursion recc = new ListByRecursion();
		ImpStackUsingArray sa = new ImpStackUsingArray();
		ImpStackUsingLL sll = new ImpStackUsingLL();
		ImpQueueUsingLL qll = new ImpQueueUsingLL();
		
		/*obj.addNodeBefore(1);
		obj.addNodeBefore(2);
		obj.addNodeBefore(3);
		obj.addNodeBefore(4);*/
		
//		obj.addNodeAfter(8);
//		obj.addNodeAfter(10);
		//obj.swapTwoNodesDJ();
		//obj.addNodeAfter(7);
		//obj.addNodeAfter(8);
		//obj.addNodeAfter(9);
		//obj.swapTwoNodesDJ();
		
		recc.addNodeAfter(10,false);	
		recc.addNodeAfter(20,false);	
		recc.addNodeAfter(30,false);	
		recc.addNodeAfter(40,true);	
		
		/*System.out.println("isEmpty is : " +sa.isEmpty());
		sa.pop();
		sa.push(12); sa.print();
		sa.push(7); sa.print();
		sa.pop(); sa.print();
		sa.push(10); sa.print();
		sa.push(24); sa.print();
		
		System.out.println("Top is : " +sa.top());
		System.out.println("isEmpty is : " +sa.isEmpty());*/
		
		/*System.out.println("isEmpty is : " +sll.isEmpty());
		System.out.println("Top is : " +sll.top());
		sll.pop();
		sll.push(12); sll.print();
		sll.push(7); sll.print();
		sll.pop(); sll.print();
		sll.push(10); sll.print();
		sll.push(24); sll.print();
		
		System.out.println("Top is : " +sll.top().data);
		System.out.println("isEmpty is : " +sll.isEmpty());*/
		
	}

}
