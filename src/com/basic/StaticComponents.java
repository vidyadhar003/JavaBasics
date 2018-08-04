package com.basic;

public  class StaticComponents {

	public static int i = 20;

	static {

		System.out.println("static 1");
	}

	{
	

		System.out.println("non-static");

	}

	public static void M1() {

		System.out.println("Static method");

		System.out.println(StaticComponents.i + 1);

	}

	static {

		System.out.println(i);

		System.out.println("Main class Sib 2");
	}

	public static void main(String[] args) {

		StaticComponents st = new StaticComponents();
		System.out.println(" main methods");

		System.out.println(StaticComponents.i);
		StaticComponents.M1();
	}
}
