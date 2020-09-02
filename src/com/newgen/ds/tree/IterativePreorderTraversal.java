package com.newgen.ds.tree;

import java.util.Stack;

public class IterativePreorderTraversal {

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
		
		traverse(root);

	}

	
    private static void traverse(Node root) {
		
		Stack<Node> stack = new Stack();
		
		while(true){
			
			while(root != null){
				System.out.print(root.data + " ");
				stack.add(root);
				root = root.left;
			}
			
			if(stack.empty()){
				break;
			}
			
			root = stack.pop();
			root = root.right;
		}
		
	}
}
