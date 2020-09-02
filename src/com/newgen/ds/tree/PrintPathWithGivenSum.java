package com.newgen.ds.tree;

import java.util.Iterator;
import java.util.Stack;

public class PrintPathWithGivenSum {

	public static void main(String[] args) {

		Node root = null;

		root = BinarySearchTree.insertNode(root,15);
		root = BinarySearchTree.insertNode(root,20);
		root = BinarySearchTree.insertNode(root,10);
		root = BinarySearchTree.insertNode(root,25);
		root = BinarySearchTree.insertNode(root,8);
		root = BinarySearchTree.insertNode(root,12);
		root = BinarySearchTree.insertNode(root,23);
		
		findPath(root);
		
		
	}

	static Stack<Node> stack = new Stack();
	static int sum = 0;
	
	private static void findPath(Node p) {
		
		if(p == null)
			return;
		
		stack.add(p);
		
		sum = sum + p.data;
		
		if(sum == 60){
			//print stack
			Iterator<Node> itr = stack.iterator();
			while(itr.hasNext()){
				System.out.print(itr.next().data + " ");
			}
		}
		
		if(p.left != null)
			findPath(p.left);
		if(p.right != null)
			findPath(p.right);
		
		sum = sum - p.data;
		stack.pop();
		
	}

}
