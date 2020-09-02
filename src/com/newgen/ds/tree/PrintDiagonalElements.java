package com.newgen.ds.tree;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PrintDiagonalElements {
	
	static Node root = null;
	static TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();

	public static void main(String[] args) {

		root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
       
        System.out.println("Following are nodes in diagonal view of Binary Tree");  
        
        PrintDiagonalView(root,0);  
        
        for (Entry<Integer, ArrayList<Integer>> it : map.entrySet()) 
        { 
        	ArrayList<Integer> list = it.getValue();
            System.out.print(list+ " "); 
        } 
	}
	
	private static void PrintDiagonalView(Node root ,int hd) {
		
		if(root == null){
			return;
		}
		
		if(!map.containsKey(hd)){
			
			ArrayList<Integer> a = new ArrayList<>();
			a.add(root.data);
			map.put(hd, a);
			System.out.println(root.data);
			
		}else{
			
			ArrayList<Integer> a = map.get(hd);
			a.add(root.data);
			map.put(hd, a);
			System.out.println(root.data);
			
		}
		
		PrintDiagonalView(root.left, hd); 
		PrintDiagonalView(root.right, hd + 1);
		
	}

}
