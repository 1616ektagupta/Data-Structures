package com.newgen.ds.list;

import java.util.LinkedList;
import java.util.Queue;

import com.newgen.ds.tree.BinarySearchTree;
import com.newgen.ds.tree.Node;

public class StoreTreeInDLL_BFS {
	
	static BinarySearchTree t = new BinarySearchTree();
	static Node root = null;
	static Node head = null;

	public static void main(String[] args) {

		root = BinarySearchTree.insertNode(root,15);
		root = BinarySearchTree.insertNode(root,20);
		root = BinarySearchTree.insertNode(root,10);
		root = BinarySearchTree.insertNode(root,25);
		root = BinarySearchTree.insertNode(root,8);
		root = BinarySearchTree.insertNode(root,12);
		root = BinarySearchTree.insertNode(root,11);
		
		BFSTraversal(root);
		print(head);
		
	}
	
	private static void BFSTraversal(Node temp) {
		
		Queue<Node> queue = new LinkedList<>();
		Node prev = null;
		Node p = temp;
		
		if(p == null){
			return;
		}
		
		queue.add(p);
		
		while(!queue.isEmpty()){
			
			p = queue.remove();
			Node cur = new Node(p.data);
			
			if(prev == null){
				head = cur;
			}else{
				cur.left = prev;
				prev.right = cur;
			}
			
			prev = cur;
			
			if(p.left != null)
				queue.add(p.left);
			if(p.right != null)
				queue.add(p.right);
		}
		
	}

	private static void print(Node head) {
		Node temp = head;	
						
		while(temp.right != null){
							
			System.out.print(temp.data + " -> ");
			temp = temp.right;
		}
		System.out.println(temp.data);
	}

}
