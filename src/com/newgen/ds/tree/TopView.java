package com.newgen.ds.tree;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TopView {
	
	static Node root = null;
	static TreeMap<Integer,pair> map = new TreeMap<>();

	public static void main(String[] args) {

		root = new Node(1);
        root.left = new Node(2); 
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
       
        System.out.println("Following are nodes in top view of Binary Tree");  
        
        PrintTopView(root,0,0);  
        
        for (Entry<Integer, pair> it : map.entrySet()) 
        { 
        	pair p = it.getValue();
            System.out.print(p.data+ " "); 
        } 
		
	}
	
	private static void PrintTopView(Node root,int height, int hd) {
		
		if(root == null){
			return;
		}
		
		if(!map.containsKey(hd)){
			
			map.put(hd, new pair(root.data,height));
			System.out.println(hd + " " +height + " " + root.data);
			
		}else{
			
			pair p = map.get(hd);
			
			System.out.println("m_height =" + p.height + "height = " + height);
			
			if(p.height > height){
				
				map.put(hd, new pair(root.data,height));
				System.out.println(root.data);
			}
			
		}
		
		PrintTopView(root.left, height + 1, hd - 1); 
		PrintTopView(root.right, height + 1, hd + 1);
		
	}
}
