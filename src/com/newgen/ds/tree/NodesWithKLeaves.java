package com.newgen.ds.tree;

public class NodesWithKLeaves {
	
	static Node root = null;
	static int k = 4;

	public static void main(String[] args) {

		root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
       
        FindNodesWithKLeafNodes(root,k);  
	}

	private static int FindNodesWithKLeafNodes(Node root, int k) {
		
		if(root.left == null && root.right == null){
			return 1;
		}
		
		int left_count = FindNodesWithKLeafNodes(root.left,k);
		int right_count = FindNodesWithKLeafNodes(root.right,k);
		int total = left_count + right_count;
		
		if(left_count + right_count == k){
			System.out.println(root.data);
			return total;
		}
		
		return total;
		
	}

}
