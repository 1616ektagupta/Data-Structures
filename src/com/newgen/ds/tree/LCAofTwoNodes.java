package com.newgen.ds.tree;

//Lowest Common Ancestor of two nodes in Binary Tree
public class LCAofTwoNodes {
	
	static Node root = null;

	public static void main(String[] args) {

		root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
       
        System.out.println("LCA is : " +  LCA(root,7,6).data);
       
	}

	private static Node LCA(Node root, int node1, int node2) {
		
		if(root == null)
			return null;
		
		if(root.data == node1 || root.data == node2){
			
			return root;
		}
		
		 Node left =  LCA(root.left,node1,node2);
		 Node right = LCA(root.right,node1,node2);
		 
		 System.out.println(left + "****" + right);
		 if(left != null)  System.out.println(left.data);
		 if(right != null)  System.out.println(right.data);
		 
		 if(left != null && right != null){
			 return root;
		 }
		 
		 else if(left == null){
			 return right;
		 }
		 else
			 return left;
		
	}

}
