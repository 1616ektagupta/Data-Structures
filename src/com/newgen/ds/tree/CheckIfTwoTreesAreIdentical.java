package com.newgen.ds.tree;

public class CheckIfTwoTreesAreIdentical {

	public static void main(String[] args) {

		Node root = null;

		root = BinarySearchTree.insertNode(root,15);
		root = BinarySearchTree.insertNode(root,20);
		root = BinarySearchTree.insertNode(root,10);
		root = BinarySearchTree.insertNode(root,25);
		root = BinarySearchTree.insertNode(root,8);
		root = BinarySearchTree.insertNode(root,12);
		root = BinarySearchTree.insertNode(root,23);
		
		Node root1 = null;

		root1 = BinarySearchTree.insertNode(root1,15);
		root1 = BinarySearchTree.insertNode(root1,20);
		root1 = BinarySearchTree.insertNode(root1,10);
		root1 = BinarySearchTree.insertNode(root1,25);
		//root1 = BinarySearchTree.insertNode(root1,8);
		root1 = BinarySearchTree.insertNode(root1,12);
		root1 = BinarySearchTree.insertNode(root1,23);
		
		if(compare(root,root1)){
			System.out.println("Trees are identical");
		}else{
			System.out.println("Trees are not identical");
		}
		
	}

	private static boolean compare(Node p1, Node p2) {
		
		if(p1 == null && p2 == null)
			return true;
		
		if(p1 != null && p2 != null)
		{
			if(p1.data == p2.data && compare(p1.left,p2.left) && compare(p1.right,p2.right))
				return true;
		}
		
		return false;
	}

}
