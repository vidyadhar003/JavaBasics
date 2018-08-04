package com.finalcheck;

public class B  extends A{
	
	
	@Override
	public void m1(int i){
		
		System.out.println("method with overrride");
	}
	
	
	public static void main(String[] args) {
		
		
		A a=new B();
		
		a.m1(10);
		
		
		
	}

}
