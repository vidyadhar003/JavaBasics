package com.foreach;

public class foreachloopArray {

	
	
	public static void main(String[] args) {
		
		
		int [][] twArray={{1,23,3,4,5},{2,5,6,7,3}};
		
		for(int [] oneArray:twArray){
			
			System.out.print("[");
			
			for(int i: oneArray){
				
				System.out.print(i+"\t");
			}
			
			System.out.print("]");
		}
	}
	
}
