package com.newgen.ds.tree;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BottomView {

	static Node root = null;
	static TreeMap<Integer,pair> map = new TreeMap<>();

	public static void main(String[] args) {

		root = new Node(20);
        root.left = new Node(8); 
        root.right = new Node(22);
        //root.right.left = new Node(4);
        root.right.right = new Node(25); 
        root.left.left = new Node(5);
        root.left.right = new Node(3); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); 
        
        System.out.println("Following are nodes in bottom view of Binary Tree");  
        
        PrintBottomView(root,0,0);  
        
        for (Entry<Integer, pair> it : map.entrySet()) 
        { 
        	pair p = it.getValue();
            System.out.print(p.data+ " "); 
        } 
		
	}
	
	private static void PrintBottomView(Node root,int height, int hd) {
		
		if(root == null){
			return;
		}
		
		if(!map.containsKey(hd)){
			
			map.put(hd, new pair(root.data,height));
			System.out.println(root.data);
			
		}else{
			
			pair p = map.get(hd);
			
			System.out.println("m_height =" + p.height + "height = " + height);
			
			if(p.height <= height){
				
				map.put(hd, new pair(root.data,height));
				System.out.println(root.data);
			}
			
		}
		
		PrintBottomView(root.left, height + 1, hd - 1); 
		PrintBottomView(root.right, height + 1, hd + 1);
		
	}

}

class pair{
	
	public int data;
	public int height;
	
	pair(int data, int height){
		this.data = data;
		this.height = height;
		
	}
	
}
