package com.newgen.ds.tree;

public class PrintAllLeaves {
	
	static Node root = null;
	static int count = 0;

	public static void main(String[] args) {

		root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
       
        CountLeaves(root); 
        System.out.println("count :" +count);
	}

	public static int CountLeaves(Node root) {
		
		if(root != null){
			
			if(root.left == null && root.right == null){
				System.out.println(root.data);
				count++;
			}else{
				
				if(root.left != null)
					CountLeaves(root.left);
				
				if(root.right != null)
					CountLeaves(root.right);
			}
			
			return count;
			
		}else{
			return 0;
		}

	}

}
