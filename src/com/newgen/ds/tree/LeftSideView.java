package com.newgen.ds.tree;

public class LeftSideView {
	
	static Node root = null;
	static int max_level = 0;
	
	public static void main(String[] args) {

		root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
       
        System.out.println("Following are nodes in LeftSideView of Binary Tree");  
        
        PrintSideView(root,1);  

	}

	private static void PrintSideView(Node root, int level) {
		
		if(root == null)
			return;
		
		if(max_level < level){
			System.out.println(root.data);
			max_level++;
		}
		
		PrintSideView(root.left,level+1);
		PrintSideView(root.right,level+1);
	}

}
