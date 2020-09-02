package com.newgen.ds.tree;

public class CheckIfSumTree {

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
        
		if(Check(root)){
			System.out.println("Sum Tree");
		}else
			System.out.println("Not a Sum Tree");

	}

	private static boolean Check(Node root) {
		
		if(root == null)
			return true; 
		
		if(root.left == null && root.right == null)
			return true;
		
		int left_sum = SumOfAllNodes.PrintSum(root.left);
		int right_sum = SumOfAllNodes.PrintSum(root.right);
		System.out.println(left_sum + "**" + right_sum);
		int total = left_sum + right_sum;
		System.out.println(total);
		
		if(total == root.data){
			
			if(Check(root.left) && Check(root.right)){
				return true;
			}
		}
		
		return false;
	}

}
