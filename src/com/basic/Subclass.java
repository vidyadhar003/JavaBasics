package com.basic;

public class Subclass extends SuperClass {

	Subclass() {
		super();

		Subclass sub = new Subclass(10);
		System.out.println("default of subclass");

	}

	Subclass(int i) {

		// super(i);

		System.out.println("parameterise construtor of Subclass");

	}

	public static void main(String[] args) {

		SuperClass ss=new Subclass();

		SuperClass sc = new SuperClass(100);
		
		//Subclass sub = new Subclass(10);

		

		//sc.methodofSupreClass();

	}
}
