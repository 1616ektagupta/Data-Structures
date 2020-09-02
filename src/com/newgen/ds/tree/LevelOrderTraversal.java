package com.newgen.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static Queue<Node> queue = new LinkedList<>();

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

	static void traverse(Node root) {

		queue.offer(root);
		queue.offer(null);
		
		while(true){
			
			Node x = queue.remove();
			if(x != null){
				System.out.print(x.data + " ");
				if(x.left != null)
					queue.offer(x.left);
				if(x.right != null)
					queue.offer(x.right);
			}else{
				System.out.println("");
				queue.offer(null);
				if(queue.peek() == null)
					return;
			}
				
		}
		
	}

}
