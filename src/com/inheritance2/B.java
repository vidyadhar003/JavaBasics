package com.inheritance2;

public class B {
	
	A a=new A();
	
	public void m2(){
		
		a.m1();
		System.out.println(a.i);
	}
	
	public void m3(){
		
	a.m1();
	
	System.out.println("b of m3");
	}
	

}
