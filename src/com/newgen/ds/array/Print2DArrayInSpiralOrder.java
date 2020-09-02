package com.newgen.ds.array;

public class Print2DArrayInSpiralOrder {

	public static void main(String[] args) {

		int rows=4,columns=4;
		int a[][] = new int[rows][columns];
		int n = 10;
		
		for(int i=0; i<rows ; i++){
			
			for(int j=0; j<columns ; j++){
				
				a[i][j] = n++;
			}
		}
		
		for(int i=0; i<rows ; i++){
			
			for(int j=0; j<columns ; j++){
				
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println("");
		}
		
		printInSpiralOrder(a,rows,columns);
	}

	private static void printInSpiralOrder(int[][] a, int rows, int columns) {
		
		System.out.println("printInSpiralOrder");
		
		int top = 0, bottom = rows-1, left = 0, right = columns-1;
		int dir = 0; //right
		
		while(top <= bottom && left <= right){
			
			if(dir == 0){
				
				for(int i=left; i<=right ; i++){
					System.out.print(a[top][i] + " ");
				}
				top++;
			}else if(dir ==1){
				
				for(int i=top; i<=bottom ; i++){
					System.out.print(a[i][right] + " ");
				}
				right--;
			}else if(dir ==2){
				
				for(int i=right; i>=left ; i--){
					System.out.print(a[bottom][i] + " ");
				}
				bottom--;
			}else{
				
				for(int i=bottom; i>=top ; i--){
					System.out.print(a[i][left] + " ");
				}
				left++;
			}
			
			dir = (dir+1)%4;
		}
		
	}

}
