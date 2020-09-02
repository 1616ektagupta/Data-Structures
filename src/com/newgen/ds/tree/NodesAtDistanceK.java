package com.newgen.ds.tree;

public class NodesAtDistanceK {

	public static void main(String[] args) {
		
		Node root = null;
		int k = 3;

		root = BinarySearchTree.insertNode(root,15);
		root = BinarySearchTree.insertNode(root,20);
		root = BinarySearchTree.insertNode(root,10);
		root = BinarySearchTree.insertNode(root,25);
		root = BinarySearchTree.insertNode(root,8);
		root = BinarySearchTree.insertNode(root,12);
		root = BinarySearchTree.insertNode(root,23);
		root = BinarySearchTree.insertNode(root,27);
		
		System.out.println("levelOrderTraversal :"); 
		LevelOrderTraversal.traverse(root); System.out.println("");
		
		findNodes(root,k);
	}

	private static void findNodes(Node root1, int k) {

		if(root1 == null){
			return;
			
		}else if(k == 0){
			System.out.print(root1.data + ", ");
		}else{
			findNodes(root1.left, k-1);
			findNodes(root1.right, k-1);
		}
	}

}
