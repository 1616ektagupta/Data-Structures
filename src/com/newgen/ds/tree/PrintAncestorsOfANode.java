package com.newgen.ds.tree;

public class PrintAncestorsOfANode {

	public static void main(String[] args) {

		Node root = null;

		root = BinarySearchTree.insertNode(root,15);
		root = BinarySearchTree.insertNode(root,20);
		root = BinarySearchTree.insertNode(root,10);
		root = BinarySearchTree.insertNode(root,25);
		root = BinarySearchTree.insertNode(root,8);
		root = BinarySearchTree.insertNode(root,12);
		root = BinarySearchTree.insertNode(root,23);
		root = BinarySearchTree.insertNode(root,27);
		
		printAncestors(root, 27);
		
		
	}

	private static boolean printAncestors(Node root, int target) {

		if(root != null){
		
			if(root.data == target)
				return true;
			
			if(printAncestors(root.left, target) || printAncestors(root.right, target)){
				System.out.println(root.data);
				return true;
			}
		}
		
		return false;		
		
	}

}
