package com.newgen.ds.tree;

public class DeleteBinaryTree {

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
		
		root = delete(root);
		//root = null;
		BinarySearchTree.postorderTraversal(root);
		
	}

	private static Node delete(Node node) {
		
		BinarySearchTree.postorderTraversal(node);
		System.out.println();

		if(node == null){
			return null;
		}else{
			
			delete(node.left);
			delete(node.right);
			node = null;
			return node;
		}
	}

}
