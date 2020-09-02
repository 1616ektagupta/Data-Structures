package com.newgen.ds.tree;

public class RightSideView {

	static Node root = null;
	static int max_level = 0;
	
	public static void main(String[] args) {

		root = new Node(12);
        root.left = new Node(1); 
        root.left.right = new Node(3); 
        root.left.left = new Node(0); 
        root.right = new Node(18);
        root.right.left = new Node(13); 
        root.right.right = new Node(20);
        root.right.left.right = new Node(17);
        root.right.right.left = new Node(19);
       
        System.out.println("Following are nodes in Right Side View of Binary Tree");  
        
        PrintSideView(root,1);  

	}
	
	private static void PrintSideView(Node root, int level) {
		
		if(root == null)
			return;
		
		if(max_level < level){
			System.out.println(root.data);
			max_level++;
		}
		
		PrintSideView(root.right,level+1);
		PrintSideView(root.left,level+1);
	}
}
