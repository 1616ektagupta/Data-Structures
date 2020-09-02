package com.newgen.ds.tree;

import java.util.Stack;

public class AllRootToLeafNodes {

	static Stack<Integer> s = new Stack<>();
	
	public static void main(String[] args) {

		Node root = null;

		root = new Node(56);
        root.left = new Node(13); 
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.right = new Node(3); 
        root.right.left = new Node(9); 
        root.right.right = new Node(3);
        root.left.left.left = new Node(3);
        root.left.left.right= new Node(2);
        root.right.right.left = new Node(2);
        root.right.right.right = new Node(1);
        
        findPath(root);
	}

	private static void findPath(Node root) {
		
		if(root == null){
			return;
		}
		
		s.push(root.data);
		
		if(root.left == null && root.right == null){
			
			Object[] a = new Object[s.size()];	//print stack from bottom to top
			s.copyInto(a);
			
			for(int i = 0; i< a.length; i++){
				System.out.print(a[i] + " ");
			}
			
			System.out.println(" ");
		}
		
		
		if(root.left != null)
			findPath(root.left);
		if(root.right != null)
			findPath(root.right);
		
		s.pop();
		
	}

}
