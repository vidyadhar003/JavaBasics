package com.inheritance1;

import com.inheritance.A;

public class D extends A {
	
	void methodofClassD()
	{
		System.out.println(k);
		System.out.println(m);
		
		A a=new A();
		
		//System.out.println(a.i); private member not visible outside the class
        //System.out.println(a.j);   Default members are not visible outside package
        //System.out.println(a.k);   Protected member can not be used outside the package.

		System.out.println(a.m);
	}
	
}
