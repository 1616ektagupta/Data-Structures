package com.newgen.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
	
	static Queue<Node> queue = new LinkedList<>();

	public static void main(String[] args) {
		
		Node root = null;

		root = insertNode(root,15);
		root = insertNode(root,20);
		root = insertNode(root,10);
		root = insertNode(root,25);
		root = insertNode(root,8);
		root = insertNode(root,12);
		root = insertNode(root,11);
		
		Scanner s  = new Scanner(System.in);
		
		for(int i=0 ; i<2 ; i++){
			
			
			boolean result = search(root,s.nextInt());
			if(result)
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
		
		System.out.println("Min Node value is :"+ findMin(root));
		System.out.println("Max Node value is :"+ findMax(root));
		System.out.println("Height of tree is :"+ height(root));
		System.out.println("levelOrderTraversal :"); levelOrderTraversal(root); System.out.println("");
		System.out.println("preorderTraversal BFS:"); preorderTraversal(root); System.out.println("");
		System.out.println("inorderTraversal DFS:"); inorderTraversal(root); System.out.println("");
		
		root = deleteNode(root,10);
		
		System.out.println("postorderTraversal :"); postorderTraversal(root); System.out.println("");
		System.out.println("isBST min max :"+ isBSTUtil(root));
		System.out.println("isBST :"+ isBST(root));
		System.out.println("inorderSuccessor of 12 :"+ inorderSuccessor(root,12).data);
		System.out.println("inorderSuccessor of 15 :"+ inorderSuccessor(root,15).data);
		System.out.println("inorderSuccessor of 25 :"+ inorderSuccessor(root,25));
		
	}
	
	public static Node insertNode(Node root , int data){
		
		if(root == null){
			root = new Node(data);
		}else if(data <= root.data){
			root.left = insertNode(root.left , data);
		}else{
			root.right = insertNode(root.right , data);
		}
		
		return root;
		
	}
	
	public static boolean search(Node root, int data){
		
		if(root == null)
			return false;
		
		if(root.data == data){
			
			return true;
			
		}else if (data > root.data){
			
			return search(root.right , data);
			 
		}else{
			return search(root.left , data);
		}
		
	}
	
	public static int findMin(Node root){
		
		if(root == null)
			return -1;
		
		if(root.left == null)
			return root.data;
		else{
			
			return findMin(root.left);
			 
		}
		
	}
	
	public static Node findMinItr(Node root){
		
		if(root == null)
			return root;
		
		while(root.left != null)
			root = root.left;
		
		return root;
			 
	}
	
	public static int findMax(Node root){
		
		if(root == null)
			return -1;
		
		if(root.right == null)
			return root.data;
		else{
			
			return findMax(root.right);
			 
		}
		
	}
	
	public static int height(Node root){
		
		if(root == null)
			return -1;
		
		int left = height(root.left);
		int right = height(root.right);
		
		return Math.max(left,right) + 1;
		
	}
	
	public static void levelOrderTraversal(Node root){
		
		if(root == null)
			System.out.println("Tree is empty");
		
		else{
			queue.offer(root);
			while(!queue.isEmpty()){
				Node temp = queue.peek();
				System.out.print(temp.data + " ");
				if(temp.left != null) queue.add(temp.left);
				if(temp.right != null) queue.add(temp.right);
				queue.poll();
			}
			System.out.println("");
		}
	}
	
	public static void preorderTraversal(Node root){
		
		if(root == null)
			return;
		
		else{
			System.out.print(root.data + " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	public static void inorderTraversal(Node root){
		
		if(root == null)
			return;
		
		else{
			inorderTraversal(root.left);
			System.out.print(root.data + " ");
			inorderTraversal(root.right);
		}
	}

	public static void postorderTraversal(Node root){
	
		if(root == null)
			return;
		
		else{
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public static boolean isBSTUtil(Node root){
			
		return isBST1(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}
	
	public static boolean isBST1(Node root,int MIN_VALUE, int MAX_VALUE){
		
		if(root == null)
		return true;
		
		if(root.data > MIN_VALUE 
				&& root.data < MAX_VALUE 
				&& isBST1(root.left, MIN_VALUE, root.data) 
				&& isBST1(root.right, root.data, MAX_VALUE)
				)
			return true;
		else
			return false;
	}
	
	public static boolean isBST(Node root){
		
		if(root == null)
			return true;
		
		if(isLeftSubTreeLesser(root.left,root.data) && isRightSubTreeGreater(root.right,root.data)
				&& isBST(root.left) && isBST(root.right))
			return true;
		else 
			return false;
			
	}
	
	public static boolean isLeftSubTreeLesser(Node root, int data){
		
		if(root == null)
		return true;
		
		if(root.data <= data && isLeftSubTreeLesser(root.left, data) && isLeftSubTreeLesser(root.right,data))
			return true;
		else
			return false;
		
	}
	
	public static boolean isRightSubTreeGreater(Node root, int data){
		
		if(root == null)
			return true;
			
			if(root.data > data && isRightSubTreeGreater(root.left, data) && isRightSubTreeGreater(root.right,data))
				return true;
			else
				return false;
		
	}
	
	public static Node deleteNode(Node root, int data){
		
		if(root == null)
			return root;
		else if(data < root.data) 
			root.left = deleteNode(root.left, data);
		else if(data > root.data) 
			root.right = deleteNode(root.right, data); 
		else{ //Node to be deleted is found
			
			if(root.left == null  && root.right == null){
				root = null;
			}
			
			else if(root.left == null){
				Node temp = root;
				root = root.right;
				temp = null;
			}
			
			else if(root.right == null){
				Node temp = root;
				root = root.left;
				temp = null;
			}
			
			else{
				Node temp = findMinItr(root.right);
				root.data = temp.data;
				root.right = deleteNode(root.right, temp.data);
			}
			
		}
		return root;
		
	}
	
	public static Node inorderSuccessor(Node root, int data){
		
		Node current = find(root,data);
		if(current == null) return null;
		
			if(current.right == null){
				
				Node successor = null;
				Node ancestor = root; 
				
				while(current != ancestor){
					
					if(current.data < ancestor.data){
						successor = ancestor;
						ancestor = ancestor.left;
					}else{
						ancestor = ancestor.right;
					}
				}
				return successor;
				
			}else{
				return findMinItr(current.right);
			}
		}
	
	public static Node find(Node root, int data){
		
		if(root == null)
			return null;
		
		if(root.data == data){
			
			return root;
			
		}else if (data > root.data){
			
			return find(root.right , data);
			 
		}else{
			return find(root.left , data);
		}
		
	}
}