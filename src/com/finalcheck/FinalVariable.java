package com.finalcheck;

public class FinalVariable {
	
	final int i=10;
	
	void m1(){
		
		//i++;
	
		int j=i+1;
		
		System.out.println(j);
		
	}
	
	public static void main(String[] args) {
		
		final FinalVariable fnl=new FinalVariable();
		
		fnl.m1();
		
		
		//fnl=new FinalVariable();
		
		System.out.println(fnl.i);
		
	}

}
