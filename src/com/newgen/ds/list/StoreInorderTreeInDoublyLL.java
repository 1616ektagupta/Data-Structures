package com.newgen.ds.list;

import com.newgen.ds.tree.BinarySearchTree;
import com.newgen.ds.tree.Node;

public class StoreInorderTreeInDoublyLL {
	
	static BinarySearchTree t = new BinarySearchTree();
	static Node root = null;
	static Node head = null;

	public static void main(String[] args) {

		root = BinarySearchTree.insertNode(root,15);
		root = BinarySearchTree.insertNode(root,20);
		root = BinarySearchTree.insertNode(root,10);
		root = BinarySearchTree.insertNode(root,25);
		root = BinarySearchTree.insertNode(root,8);
		root = BinarySearchTree.insertNode(root,12);
		root = BinarySearchTree.insertNode(root,11);
		
		inorderTraversal(root);
		print(head);
		
	}
	
	
	static Node prev = null;
	
	public static void inorderTraversal(Node root){
		
		if(root == null)
			return;
		
		else{
			inorderTraversal(root.left);
			
			if(prev == null){
				head = root;
			}else{
				root.left = prev;
				prev.right = root;
			}
			
			prev = root;
			
			inorderTraversal(root.right);
		}
	}
	
	private static void print(Node head) {
		Node temp = head;	
						
		while(temp.right != null){
							
			System.out.print(temp.data + " -> ");
			temp = temp.right;
		}
		System.out.println(temp.data);
	}

}
