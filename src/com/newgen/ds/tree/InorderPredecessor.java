package com.newgen.ds.tree;

public class InorderPredecessor {

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
		
		inorderPredecessor(root,23);
		System.out.println("inorderPredecessor of 23 is : "+ inorderPredecessor(root,23).data);

	}

public static Node inorderPredecessor(Node root, int data){
		
		Node current = BinarySearchTree.find(root,data);
		if(current == null) return null;
		
			if(current.left == null){
				
				Node predecessor = null;
				Node ancestor = root; 
				
				while(current != ancestor){
					
					if(current.data < ancestor.data){
						ancestor = ancestor.left;
					}else{
						predecessor = ancestor;
						ancestor = ancestor.right;
					}
				}
				return predecessor;
				
			}else{
				Node temp = current.left;
				while(temp.right != null){
					temp = temp.right;
				}
				return temp;
			}
		}
	
}
