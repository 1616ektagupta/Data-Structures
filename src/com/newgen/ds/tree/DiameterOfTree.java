package com.newgen.ds.tree;

//The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes
public class DiameterOfTree {
	
	static Node root = null;

	public static void main(String[] args) {

		root = new Node(20);
        /*root.left = new Node(8); 
        root.right = new Node(22);
        //root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.right.right.right = new Node(25); 
        root.left.left = new Node(5);
        root.left.right = new Node(3); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); */
		
        System.out.println(findDiameter(root));
        
	}

	private static int findDiameter(Node root2) {
		
		if(root2 == null)
			return 0;
		
		int left_height = BinarySearchTree.height(root2.left);
		int right_height = BinarySearchTree.height(root2.right);
		
		int lDia = findDiameter(root2.left);
		int rDia = findDiameter(root2.right);
		
		System.out.println(root2.data + " : " + (left_height + right_height));
		
		return Math.max((left_height + right_height + 2),Math.max(lDia,rDia));
		
	}

}
