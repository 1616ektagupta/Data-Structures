package com.newgen.ds.tree;

import java.util.Stack;

public class ZigZagOrSpiralTraversal {

	    static Stack<Node> s1 = new Stack();
	    static Stack<Node> s2 = new Stack();
	    
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
		
		print(root);
	}

	private static void print(Node root) {
		
		if(root == null)
			return;
		
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty())	{
			
			while(!s1.isEmpty()){
				
				Node x = s1.pop();
				System.out.print(x.data + " ");
				
				if(x.left != null) s2.push(x.left);
				if(x.right != null) s2.push(x.right);
				
			}
			
			System.out.println("");
			
			while(!s2.isEmpty()){
				
				Node x = s2.pop();
				System.out.print(x.data + " ");
				
				if(x.right != null) s1.push(x.right);
				if(x.left != null) s1.push(x.left);
				
			}
			
			System.out.println("");
		}
	}

}
