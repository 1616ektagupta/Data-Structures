package com.newgen.ds.tree;

public class SumOfAllNodes {
	
	static Node root = null;

	public static void main(String[] args) {
		
		root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
       
        System.out.println("Sum of Binary Tree : " + PrintSum(root));  
        
	}

	static int PrintSum(Node root) {
		
		if(root == null)
			return 0;
		
		int sum = root.data + PrintSum(root.left) + PrintSum(root.right);
		return sum;
		
	}

}
