package com.basic;

class A {
/*
	int nonStaticVariable;
	static int staticVariable;

	static void staticMethod() {

		System.out.println(staticVariable);

	}

	void nonStaticMethod() {

		System.out.println(staticVariable);

		System.out.println(nonStaticVariable);
	}
*/
	
	static {
		
		System.out.println("Static block");
	}
	
	
	{
		
		System.out.println("non-static block");
	}
	
}

public class NonStatic {
		public static void main(String[] args) {
			
			
			A a1=new A();
		//	NonStatic non=new NonStatic();
			
			
			System.out.println("MainStart");
		
			
			
			/*A.staticVariable=10;
			A.staticMethod();
			
			A a1=new A();
			A a2=new A();
			
			System.out.println(a1.nonStaticVariable);
			System.out.println(a1.staticVariable);
			
			a1.nonStaticMethod();
			a1.staticMethod();
			
			System.out.println(a2.staticVariable);
			a1.staticMethod();
			
			System.out.println(a2.staticVariable);
			a1.staticVariable=20;
			System.out.println(a2.staticVariable);
			*/
			
		
	}

}
