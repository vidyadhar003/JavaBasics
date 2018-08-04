
package com.basic;

class B {

	int i;

	{

		System.out.println(" First Instance Block");
	}

	{

		System.out.println("Second Instance Block");
	}

	B(int i) {

		// this();
		System.out.println("First construtor");
	}

	B() {
super();
		System.out.println("Second Construtor");
	}
}

	public class InstanceBlock {
		
		public static void main(String[] args) {
			
			B a1=new B(10);
			
		}

	}


